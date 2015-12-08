/**
 * FastjsonDeserialize.java
 */
package com.github.jieshaocd.fastjson;

import com.alibaba.fastjson.JSON;
import com.github.jieshaocd.IDeserialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public class FastjsonDeserialize implements IDeserialize<App> {

    public App deserialize(byte[] array) {
        return JSON.parseObject(new String(array), App.class);
    }

}
