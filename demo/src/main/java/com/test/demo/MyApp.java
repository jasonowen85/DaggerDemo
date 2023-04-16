package com.test.demo;

import android.app.Application;

import com.test.demo.component.CommonComponent;
import com.test.demo.component.DaggerCommonComponent;
import com.test.demo.module.CommonModule;

import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;

public class MyApp extends Application  {
    /**
     * init common module 保持唯一性 项目单利 singleTon
     */
    private CommonComponent commonComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        commonComponent = DaggerCommonComponent.builder().commonModule(new CommonModule()).build();
    }

    public CommonComponent getCommonComponent() {
        return commonComponent;
    }

//    @Override
//    public AndroidInjector<Object> androidInjector() {
//        // TODO: 2023/4/15  commonComponent 对象
//        return null;
//    }
}
