package com.abhishek.fundhawk.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ArrayAdapter;
import com.abhishek.fundhawk.R;
import com.abhishek.fundhawk.databinding.ActivitySearchBinding;
import com.abhishek.fundhawk.di.ViewModelFactory;
import java.util.List;
import javax.inject.Inject;
import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class SearchActivity extends DaggerAppCompatActivity {

    @Inject
    ViewModelFactory factory;

    private SearchActivityViewModel viewModel;

    private ActivitySearchBinding binding;

    @Inject
    SelectedListAdapter adapter;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        AndroidInjection.inject(this);
        viewModel = ViewModelProviders.of(this, factory).get(SearchActivityViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        binding.setViewModel(viewModel);

        viewModel.successCommand.observe(this, baseCommand -> {

            assert baseCommand != null;
            updateAutoCompleteAdapter(baseCommand);

        });

        viewModel.updateAdapter.observe(this, searchResults -> {

            adapter.setSearchResultList(searchResults);
            binding.searchList.setLayoutManager(new LinearLayoutManager(this));
            binding.searchList.setAdapter(adapter);
        });



    }

    private void updateAutoCompleteAdapter(List<String> first) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.dialog_text,
                first);
        binding.searchBar.setAdapter(null);

        binding.searchBar.setAdapter(adapter);
        if (binding.searchBar.getText().toString().length() >= 3)
            binding.searchBar.showDropDown();

        binding.searchBar.setOnItemClickListener((adapterView, view, i, l) -> {
            //noinspection SuspiciousMethodCalls
            int k = first.indexOf(adapterView.getItemAtPosition(i));
            viewModel.onItemSelected(k);
            binding.searchBar.setText("");

        });
    }
}
