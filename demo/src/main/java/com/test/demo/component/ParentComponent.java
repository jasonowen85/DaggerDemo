package com.test.demo.component;

import com.test.demo.module.FirstModule;
import com.test.demo.module.ParentModule;
import com.test.demo.qualifier.SubComponentScope;
import com.test.demo.viewmodel.DetailViewModel;

import dagger.Component;

@SubComponentScope
@Component(modules = {ParentModule.class})
public
interface ParentComponent {
    void inject(DetailViewModel detailViewModel);

    MySubComponent getSubComponent(FirstModule firstModule);
}
