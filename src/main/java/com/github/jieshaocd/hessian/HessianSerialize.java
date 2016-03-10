/**
 * 
 */
package com.github.jieshaocd.hessian;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.caucho.hessian.io.Hessian2StreamingOutput;
import com.github.jieshaocd.ISerialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @since  Jan 5, 2016
 *
 */
public class HessianSerialize implements ISerialize<App> {

    @Override
    public byte[] serialize(App object) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(256);
        Hessian2StreamingOutput h2so = new Hessian2StreamingOutput(bos);
        try {
            h2so.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bos.toByteArray();
    }

}
