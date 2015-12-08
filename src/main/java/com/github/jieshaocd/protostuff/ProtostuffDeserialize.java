/**
 * ProtostuffDeserialize.java
 */
package com.github.jieshaocd.protostuff;

import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

import com.github.jieshaocd.IDeserialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public class ProtostuffDeserialize implements IDeserialize<App> {

    public App deserialize(byte[] array) {
        Schema<App> schema = RuntimeSchema.getSchema(App.class);
        App app = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(array, app, schema);
        return app;
    }

}
