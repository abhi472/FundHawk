package com.abhishek.fundhawk.di;

import android.arch.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;

@Module
interface ViewModelModule {

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);


}
