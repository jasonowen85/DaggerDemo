package com.test.demo.model;

import javax.inject.Inject;

import androidx.databinding.library.baseAdapters.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class DataBean extends BaseObservable {

    private String name;

    @Inject
    public DataBean() {
        this.name =" jack is very good";
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
