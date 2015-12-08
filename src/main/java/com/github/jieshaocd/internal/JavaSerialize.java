/**
 * 
 */
package com.github.jieshaocd.internal;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

import com.github.jieshaocd.ISerialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @since  Dec 8, 2015
 *
 */
public class JavaSerialize implements ISerialize<App> {

    public byte[] serialize(App object) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(256);
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }

}
