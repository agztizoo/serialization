package com.github.jieshaocd.beanfactory;

import java.io.Serializable;

public class Provider implements Serializable {
    private static final long serialVersionUID = 5166101892919337801L;

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
