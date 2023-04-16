package com.test.demo.module;



import com.test.demo.qualifier.AdasScope;
import com.test.demo.repository.AdasData;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * dependencies supply
 */
@Module
public class HomeModule {

    @AdasScope
    @Provides
    public AdasData provideAdasData() {
        return new AdasData(1);
    }

    @Named("safe")
    @Provides
    public AdasData provideAdasTwoData() {
        return new AdasData(2);
    }
}
