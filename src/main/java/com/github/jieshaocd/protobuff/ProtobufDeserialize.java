/**
 * ProtobufDeserialize.java
 */
package com.github.jieshaocd.protobuff;

import com.github.jieshaocd.IDeserialize;
import com.github.jieshaocd.protobuff.ProtoApp.App;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author jieshao
 * @date Nov 16, 2015
 */
public class ProtobufDeserialize implements IDeserialize<App> {

    public App deserialize(byte[] array) {
        try {
            return ProtoApp.App.parseFrom(array);
        } catch (InvalidProtocolBufferException e) {
            return null;
        }
    }

}
