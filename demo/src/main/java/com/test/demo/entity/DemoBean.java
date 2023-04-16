package com.test.demo.entity;

import javax.inject.Inject;

public class DemoBean {

    private String name ="hello good entire";

    @Inject
    public DemoBean() {
    }

    public String getName() {
        return name;
    }
}
