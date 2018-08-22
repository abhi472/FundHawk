package com.abhishek.fundhawk.ui.compare;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import com.abhishek.fundhawk.repository.ApiRepository;
import com.abhishek.fundhawk.repository.ApiRepositoryHelper;

import javax.inject.Inject;

public class CompareFundViewModel extends ViewModel {

    private ApiRepository repository;

    public ObservableField<Boolean> listVisibility = new ObservableField<>(true);

    public ObservableField<Boolean> progressVisibility = new ObservableField<>(true);

    public ObservableField<Boolean> errorVisibility = new ObservableField<>(true);

    @Inject
    public CompareFundViewModel(ApiRepositoryHelper apiRepository) {
     this.repository = apiRepository;
    }

}
