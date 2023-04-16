package com.test.demo.model;

import javax.inject.Inject;

public class GearModel {

    private String name;

    @Inject
    public GearModel() {
        name = " this is gear model";
    }

    public String getName() {
        return name;
    }
}
