package com.test.demo.module;

import com.test.demo.model.BydStudyModel;
import com.test.demo.qualifier.SubComponentScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ParentModule {

    @SubComponentScope
    @Provides
    public BydStudyModel provideStudy() {
        return new BydStudyModel();
    }
}
