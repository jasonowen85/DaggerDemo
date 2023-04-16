package com.test.demo.component;

import com.test.demo.module.FirstModule;
import com.test.demo.qualifier.SubComponentScope;
import com.test.demo.viewmodel.FirstFragmentViewModel;

import dagger.Component;

@SubComponentScope
@Component(modules = {FirstFragmentViewModel.class})
public interface ParentComponent {
    void inject(FirstFragmentViewModel firstFragmentViewModel);

    MySubComponent getSubComponent(FirstModule firstModule);
}
