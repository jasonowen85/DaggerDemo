package com.test.demo.viewmodel;

import com.test.demo.model.GearModel;
import com.test.demo.qualifier.SubComponentScope;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

public class FirstFragmentViewModel extends ViewModel {


    GearModel gearModel;

    public FirstFragmentViewModel() {

    }
}
