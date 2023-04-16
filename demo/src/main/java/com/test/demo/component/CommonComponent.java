package com.test.demo.component;

import com.test.demo.module.CommonModule;
import com.test.demo.repository.AdasRegister;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CommonModule.class})
public interface CommonComponent {
    AdasRegister provideAdasRegister();
}
