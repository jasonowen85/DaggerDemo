package com.test.demo.viewmodel;

import com.test.demo.MyApp;
import com.test.demo.component.DaggerBaseComponent;
import com.test.demo.module.HomeModule;
import com.test.demo.qualifier.AdasScope;
import com.test.demo.qualifier.CommonScope;
import com.test.demo.repository.AdasData;
import com.test.demo.repository.AdasRegister;

import javax.inject.Inject;
import javax.inject.Named;


public class MainViewModel extends BaseViewModel {

    private MyApp app;

    @AdasScope
    @Inject
    AdasData adas;

    @Named("safe")
    @Inject
    AdasData adas2;

    @CommonScope
    @Inject
    AdasRegister register;


    public MainViewModel () {
//        DaggerBaseComponent.builder()
//                .homeModule(new HomeModule())
//                .commonComponent(get)
//                .build().inject(this);
//        if (null != dataBean) {
//            Log(" data bean = "+ dataBean.getName());
//            Log(" adas data = "+ adas.toString());
//        }
    }

    public MainViewModel(MyApp app) {
        this.app = app;
        DaggerBaseComponent.builder()
                .homeModule(new HomeModule())
                .commonComponent(app.getCommonComponent())
                .build().inject(this);
        if (null != dataBean) {
            Log(" data bean = "+ dataBean.getName()+" hashCode ="+ dataBean.hashCode());
            Log(" adas data = "+ adas.toString()+" hashCode ="+ adas.hashCode());
            Log(" register = "+ register.hashCode());
        }
    }
}
