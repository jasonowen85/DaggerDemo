package com.test.demo.viewmodel;


import com.mvvm.commonbase.Utils.LogUtils;

import com.test.demo.component.DaggerParentComponent;
import com.test.demo.component.ParentComponent;
import com.test.demo.model.BydStudyModel;
import com.test.demo.model.GearModel;
import com.test.demo.module.FirstModule;
import com.test.demo.module.ParentModule;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

public class FirstFragmentViewModel extends ViewModel {
    private static final String TAG = "FirstFragmentViewModel";

    @Inject
    BydStudyModel studyModel;

    @Inject
    GearModel gearModel;

    public FirstFragmentViewModel(AppCompatActivity activity) {
        ParentComponent parent = DaggerParentComponent.builder().parentModule(new ParentModule()).build();
        parent.getSubComponent(new FirstModule()).inject(this);

        LogUtils.iL(TAG, " gearModel "+ gearModel.getName());
        LogUtils.iL(TAG, " studyModel "+ studyModel.getName());
    }
}
