package com.abhishek.fundhawk.ui.search;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import com.abhishek.fundhawk.model.SearchResult.SearchResult;

import java.util.Locale;

import javax.inject.Inject;

public class SelectedListAdapterViewModel extends ViewModel {

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<String> details = new ObservableField<>("");


    @Inject
    public SelectedListAdapterViewModel() {
    }

    public void setFields(SearchResult result) {
        name.set(result.getName());
        details.set(String.format(Locale.getDefault(), "%s | Min Inv. ₹%d", result.getCategory(),
                result.getMinimumInvestment()));
    }

}
