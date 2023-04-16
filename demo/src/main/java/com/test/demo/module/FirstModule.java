package com.test.demo.module;

import com.test.demo.model.GearModel;
import com.test.demo.qualifier.SubComponentScope;

import dagger.Module;
import dagger.Provides;

@Module
public class FirstModule {

    @Provides
    public GearModel provideGearModel() {
        return new GearModel();
    }
}
