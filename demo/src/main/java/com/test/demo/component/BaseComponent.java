package com.test.demo.component;

import com.test.demo.module.HomeModule;
import com.test.demo.qualifier.CommonScope;
import com.test.demo.viewmodel.MainViewModel;

import dagger.Component;

@CommonScope
@Component(modules = {HomeModule.class}, dependencies = {CommonComponent.class})
public interface BaseComponent {
    void inject(MainViewModel viewModel);
}
