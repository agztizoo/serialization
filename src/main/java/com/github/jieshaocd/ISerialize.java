/**
 * Ser.java
 */
package com.github.jieshaocd;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public interface ISerialize<T> {

    public byte[] serialize(T object);

}
