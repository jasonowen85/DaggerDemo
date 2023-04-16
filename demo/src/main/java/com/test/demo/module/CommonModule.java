package com.test.demo.module;


import com.test.demo.repository.AdasRegister;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 全局 单例对象 通过 dependence
 */
@Module
public class CommonModule {

    private AdasRegister adasRegister;

    @Singleton
    @Provides
    AdasRegister provideAdasRegister() {
        if (null == adasRegister) {
            adasRegister = new AdasRegister();
        }
        return adasRegister;
    }
}
