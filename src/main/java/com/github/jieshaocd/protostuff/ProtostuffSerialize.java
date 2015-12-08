/**
 * ProtostuffSerialize.java
 */
package com.github.jieshaocd.protostuff;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

import com.github.jieshaocd.ISerialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public class ProtostuffSerialize implements ISerialize<App> {


    public byte[] serialize(App object) {
        Schema<App> schema = RuntimeSchema.getSchema(App.class);
        LinkedBuffer buffer = LinkedBuffer.allocate(4096);
        byte[] result = null;
        try {
            result = ProtostuffIOUtil.toByteArray(object, schema, buffer);
        } catch (Exception e) {} finally {
            buffer.clear();
        }
        return result;
    }

}
