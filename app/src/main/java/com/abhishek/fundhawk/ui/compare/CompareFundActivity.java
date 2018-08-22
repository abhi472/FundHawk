package com.abhishek.fundhawk.ui.compare;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.abhishek.fundhawk.R;
import com.abhishek.fundhawk.databinding.ActivityCompareFundBinding;
import com.abhishek.fundhawk.di.ViewModelFactory;
import com.abhishek.fundhawk.model.ComparisonBody;
import com.abhishek.fundhawk.ui.search.SearchActivityViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class CompareFundActivity extends DaggerAppCompatActivity {

    @Inject
    ViewModelFactory factory;

    private CompareFundViewModel viewModel;

    private ActivityCompareFundBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_fund);
        AndroidInjection.inject(this);
        viewModel = ViewModelProviders.of(this, factory).get(CompareFundViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_compare_fund);
        binding.setViewModel(viewModel);

        ArrayList<String> keys = getIntent().getStringArrayListExtra("keys");

        viewModel.init(keys);

        viewModel.updateAdapter.observe(this, comparisonBodies -> {
            Log.d("check", "onCreate: "+comparisonBodies);
        });
    }
}
