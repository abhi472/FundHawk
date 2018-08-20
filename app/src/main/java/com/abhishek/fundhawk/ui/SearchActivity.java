package com.abhishek.fundhawk.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abhishek.fundhawk.R;
import com.abhishek.fundhawk.databinding.ActivitySearchBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class SearchActivity extends DaggerAppCompatActivity {

    @Inject
    ViewModelProvider.Factory factory;

    private SearchActivityViewModel viewModel;

    private ActivitySearchBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        AndroidInjection.inject(this);
        viewModel = ViewModelProviders.of(this).get(SearchActivityViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        binding.setViewModel(viewModel);

    }
}
