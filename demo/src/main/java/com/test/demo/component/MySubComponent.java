package com.test.demo.component;

import com.test.demo.module.FirstModule;
import com.test.demo.viewmodel.FirstFragmentViewModel;


import dagger.Subcomponent;


@Subcomponent(modules = {FirstModule.class})
public interface MySubComponent {

    void inject(FirstFragmentViewModel firstFragmentViewModel);
}
