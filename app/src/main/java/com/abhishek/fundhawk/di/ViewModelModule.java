package com.abhishek.fundhawk.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.abhishek.fundhawk.ui.SearchActivityViewModel;
import com.abhishek.fundhawk.ui.SelectedListAdapterViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
interface ViewModelModule {

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(SearchActivityViewModel.class)
    ViewModel bindSearchViewModel(SearchActivityViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SelectedListAdapterViewModel.class)
    ViewModel bindSelectedListAdapterViewModel(SelectedListAdapterViewModel viewModel);


}
