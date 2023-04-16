package com.test.demo.module;

import com.test.demo.model.GearModel;
import com.test.demo.qualifier.SubComponentScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FirstModule {

    @Singleton
    @Provides
    public GearModel provideGearModel() {
        return new GearModel();
    }
}
