package com.abhishek.fundhawk.ui;

import android.arch.lifecycle.ViewModel;

import com.abhishek.fundhawk.repository.ApiRepository;

import javax.inject.Inject;

public class SearchActivityViewModel extends ViewModel {

    ApiRepository repository;

    @Inject
    public SearchActivityViewModel(ApiRepository repository) {
        this.repository = repository;

    }

}
