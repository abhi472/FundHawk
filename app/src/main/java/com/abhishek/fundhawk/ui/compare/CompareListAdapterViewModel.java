package com.abhishek.fundhawk.ui.compare;

import android.arch.lifecycle.ViewModel;
import android.databinding.Observable;
import android.databinding.ObservableField;

import com.abhishek.fundhawk.model.ComparisonBody;

import javax.inject.Inject;

public class CompareListAdapterViewModel extends ViewModel {

    public ObservableField<String> title = new ObservableField<>("");
    public ObservableField<String> first = new ObservableField<>("");
    public ObservableField<String> second = new ObservableField<>("");
    public ObservableField<String> third = new ObservableField<>("");
    public ObservableField<Boolean> thirdVisibility = new ObservableField<>(false);



    @Inject
    public CompareListAdapterViewModel() {
    }

    public void setFields(ComparisonBody body) {
        title.set(body.getTitle());
        first.set(body.getValues().get(0));
        second.set(body.getValues().get(1));
        if(body.getValues().size() == 3) {
            thirdVisibility.set(true);
            third.set(body.getValues().get(2));

        }

    }
}
