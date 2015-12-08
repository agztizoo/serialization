/**
 * Protobuffer.java
 */
package com.github.jieshaocd;

import com.github.jieshaocd.beanfactory.AppFactory;
import com.github.jieshaocd.protobuff.ProtoApp.App;
import com.github.jieshaocd.protobuff.ProtobufDeserialize;
import com.github.jieshaocd.protobuff.ProtobufSerialize;
import com.github.jieshaocd.utils.AppUtil;

/**
 * @author jieshao
 * @date Nov 16, 2015
 */
public class Protobuffer {

    private static ISerialize<App> ser = new ProtobufSerialize();
    private static IDeserialize<App> deser = new ProtobufDeserialize();

    public static void main(String[] args) {
        App app = AppUtil.copyFrom(AppFactory.createInstance());
        testSer(app);
        testDeser(app);
        //        byte[] array = ser.serialize(app);
        //        App newOne = deser.deserialize(array);
        //        System.out.println(newOne);
    }

    public static void testSer(App app) {
        long start = System.currentTimeMillis();
        long size = 0L;
        for (int i = 0; i < 1000; i++) {
            byte[] array = ser.serialize(app);
            size += array.length;
        }
        long cost = (System.currentTimeMillis() - start);
        System.out.println("ser: " + cost);
        System.out.println("size: " + size / 1000);
    }

    public static void testDeser(App app) {
        byte[] array = ser.serialize(app);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            deser.deserialize(array);
        }
        long cost = (System.currentTimeMillis() - start);
        System.out.println("deser: " + cost);
    }
}
