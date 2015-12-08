/**
 * SerializeInvocationHandler.java
 */
package com.github.jieshaocd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private Object source;

    public InvocationHandlerImpl(Object source) {
        this.source = source;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = method.invoke(source, args);
        long end = System.currentTimeMillis();
        long cost = (end - start) / 1000;
        System.out.println(source.getClass().getName() + ": " + cost);
        if (source instanceof ISerialize) {
            byte[] array = (byte[]) result;
            System.out.println("size: " + array.length);
        }
        return result;
    }

}
