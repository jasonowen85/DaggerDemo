package com.test.demo.module;

import com.test.demo.model.GearModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FirstModule {

    @Provides
    public GearModel provideGearModel() {
        return new GearModel();
    }
}
