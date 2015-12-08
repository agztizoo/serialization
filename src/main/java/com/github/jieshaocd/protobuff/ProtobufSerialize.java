/**
 * ProtobufSerialize.java
 */
package com.github.jieshaocd.protobuff;

import com.github.jieshaocd.ISerialize;
import com.github.jieshaocd.protobuff.ProtoApp.App;
import com.github.jieshaocd.protobuff.ProtoApp.App.Builder;

/**
 * @author jieshao
 * @date Nov 16, 2015
 */
public class ProtobufSerialize implements ISerialize<App> {

    public byte[] serialize(App object) {
        Builder builder = ProtoApp.App.newBuilder();
        builder.mergeFrom(object);
        App newInst = builder.build();
        return newInst.toByteArray();
    }

}
