/**
 * 
 */
package com.github.jieshaocd.internal;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import com.github.jieshaocd.IDeserialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @since  Dec 8, 2015
 *
 */
public class JavaDeserialize implements IDeserialize<App> {

    @Override
    public App deserialize(byte[] array) {
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (App) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
