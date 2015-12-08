/**
 * Deserialize.java
 */
package com.github.jieshaocd;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public interface IDeserialize<T> {

    public T deserialize(byte[] array);

}
