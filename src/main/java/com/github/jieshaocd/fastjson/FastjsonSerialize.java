/**
 * FastjsonSerialize.java
 */
package com.github.jieshaocd.fastjson;

import com.alibaba.fastjson.JSON;
import com.github.jieshaocd.ISerialize;
import com.github.jieshaocd.beanfactory.App;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public class FastjsonSerialize implements ISerialize<App> {

    public byte[] serialize(App object) {
        return JSON.toJSONString(object).getBytes();
    }

}
