/**
 * 
 */
package com.github.jieshaocd.hessian;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import com.caucho.hessian.io.Hessian2StreamingInput;
import com.github.jieshaocd.IDeserialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @since  Jan 5, 2016
 *
 */
public class HessianDeserialize implements IDeserialize<App> {

    @Override
    public App deserialize(byte[] array) {
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        Hessian2StreamingInput h2si = new Hessian2StreamingInput(bais);
        try {
            return (App) h2si.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
