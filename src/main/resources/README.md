Message Type

首先我们看一个例子
message SearchRequest{
    required string query = 1;
    optional int32 page_number = 2;
    optional int32 result_per_page = 3;
}
这个例子中, 我们定义了两个数值类型的字段(page_number和result_per_page), 以及一个字符串类型的字段(query)

指定标记(tags)
上面这个例子中, 我们可以看到每个字段都有一个唯一标识(unique numbered tag), 这个标识用于确定这些字段在二进制编码后的顺序, 一旦使用了之后, 这个标识就不能修改
标记最小值为1, 最大值是2的29次方-1, 也就是536,870,911, 其中:
tag值从1-15是单字节编码, 包含标记和字段类型, 适合用于频繁使用的字段
tag值从16-2047是双字节编码
tag值从19000-19999是protobuf预留字段
注意, 这个tag值一旦指定了之后就不能修改,所以为了给以后扩展留下余地,在1-15这个区间,最好预留一些

指定字段规则
目前支持的规则有3中:
required: 必填字段
optional: 可选字段
repeated: 可以有0个或者多个的字段

这里需要特别注意的是,业务字段最好不要设置为required, 否则一旦业务变化这些字段被取消掉的话,客户端就无法识别收到的消息

保留字段
当我们修改了proto定义文件,将一些字段删掉或者注释掉之后,后来的开发者有可能会重用这些标记值,这样会就造成老的客户端读取数据失败,所以如果一个标记不需要之后,为了客户端不会解析错误,最好把这些标记设为保留,这样后来的开发者就不会再使用这些标记
mesage Foo{
    reserved 2, 15, 9 to 11;
    reserved "foo", "bar";
}

字段类型

proto         C++       Java       说明
double        double    double
float         float     float
int32         int32     int        变长编码,如果有负数的话,效率不好,建议使用sint32
int64         int64     long       变长编码,如果有负数的话,效率不好,建议使用sint64
uint32        uint32    int        变长编码
uint64        uint64    long       变长编码
sint32        int32     int        变长编码,有符号数,适合用于含负数的编码
sint64        int64     long       变长编码,有符号数,适合用于含负数的编码
fixed32       uint32    int        4字节定长编码,如果值大于2的28次方,性能优于uint32
fixed64       uint64    long       8字节定长编码,如果值大于2的56次方,性能优于uint64
sfixed32      int32     int        4字节定长编码
sfixed64      int64     int        8字节定长编码
bool          bool      boolean
string        string    String     只包含UTF-8或者ASCII
bytes         string    ByteString 可以包含任意字节序列

可选字段的默认值
如果希望给一个optional指定一个默认值的话,可以使用default关键字,客户端在解析的时候,如果发现这个字段没有值的话,就会使用该默认值代替
optional int32 result_per_page = 3 [default = 10];

枚举类型
在定义消息的时候,如果希望某个字段只能是一些给定值中的某一个,那么可以使用enum关键字指定该字段为枚举类型,客户端解析这个字段的时候,如果发现值不是给定的枚举值中的一个,则会忽略掉字段
message SearchRequest{
    enum Corpus{
        option allow_alias = true;//表示可以使用别名
        UNIVERSAL = 0;
        WEB = 1;
        IMAGE = 2;
        IMAGE_ALIAS = 2;//如果不允许使用别名的话,这里会报错
    }
    optional Corpus = 4 [default = UNIVERSAL];
}
枚举常量只能是32位数字,并且如果出现负数的话,会影响效率, 在一个文件中定义了一个枚举类型之后,可以在其他任意地方重用该枚举类型

复合类型
在一个字段上也可以使用一个复合类型
message SearchRequest{
    repeated Result result = 1;
}
message Result{
    required string url = 1;
    optional string title = 2;
    repeated string snippets = 3;
}

导入定义
上面这个例子中,Result和SearchRequest是在同一个文件中,如果它们不在同一个文件中的话,需要使用import关键字来导入
import "myproject/other_protos.proto";

import有两种,一种是import,另一种是import public, 如果你希望import你的客户端可以看到你import进来的类型的话,需要使用import public,否则使用import,你引入的类型对客户端不可见

在protocol编译器编译proto文件的时候,可以使用-I或--protp_path来指定import的根路径,如果没有指定的话,import从命令执行的路径开始查找

嵌套类型
proto文件中,可以配置一些嵌套类型,如果外部想使用这个嵌套类型的话,需要使用Parent.SubType的方式引用

修改存在的类型
如果需要修改一个已经存在的类型的话,有以下几点需要注意:
1. 不能修改已经存在的字段的tag值
2. 任何新增的字段只能是optional或者repeated,这样老的客户端解析你的文件就不会有问题,如果你是客户端的话,你也可以为这些字段加上默认值
3. 你只能去掉非required字段,记得去掉之后将这些去掉的tag设置为reserved
4. int32,uint32,int64,uint64,bool这几个字段是相互兼容的,可以任意替换,但是如果从一个大字段强制转型为一个小字段,可能发生截取
5. sint32和sint64是相互兼容的,但是和其他数值类型不兼容
6. string和bytes只有在UTF-8下才是相互兼容的
7. fixed32和sfixed32是兼容的,fixed64和sfixed64是兼容的
8. optional和repeated是兼容的,如果一个repeated类型转换成optional的话,如果该字段是基础类型,则会取最后一个,如果是一个message类型,则会将这些类型merge到一起
9. default值可以修改,default值不会被序列化出去,它只会影响你自己读取的数据

proto定义扩展
如果你希望第三方可以扩展你的定义,那么你需要为这些扩展指定一个tag范围,比如
message Foo{
    extensions 100 to 199;//也可以直接指定到100 to max
}
如果你这样定义的话,第三方扩展就可以使用[100,199]来扩展你的定义:
extend Foo{
    optional int32 bar = 126;
}

多个可选字段只能有一个有值
如果你希望你定义的多个optional字段最多只能有一个有值的话,你可以使用oneof关键字,这些字段将使用同一个get和set方法
message SampleMessage{
    oneof test_oneof{
        string name = 4;
        SubMessage sub_message = 9;
    }
}
1. 为oneof中的一个字段设值,会自动清除其他所有字段的值
2. 解析器同时遇到oneof中的多个成员时,只会解析最后一个
3. extensions不支持oneof
4. oneof字段不能是repeated

Java开发实例
1. 定义.proto文件
2. 使用protocol buffer编译器生成对应的bean
3. 使用protocol java api读写消息

proto文件中两个可选参数
java_package:生成java文件的包名
java_outer_classname:生成java文件的类名

编译生成java源文件
protoc -I=$src_dir --java_out=$dst_dir $src_dir/xxx.proto

其中-I指定proto文件的路径,如果没有指定,默认是当前路径
--java_out指定目标文件生成的路径









