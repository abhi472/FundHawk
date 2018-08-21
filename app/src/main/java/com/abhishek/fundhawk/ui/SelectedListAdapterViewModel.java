package com.abhishek.fundhawk.ui;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import com.abhishek.fundhawk.model.SearchResult.SearchResult;

import javax.inject.Inject;

public class SelectedListAdapterViewModel extends ViewModel {

    public ObservableField<String> name = new ObservableField<>("");

    @Inject
    public SelectedListAdapterViewModel() {
    }

    public void setFields(SearchResult result) {
name.set(result.getName());
    }

}
