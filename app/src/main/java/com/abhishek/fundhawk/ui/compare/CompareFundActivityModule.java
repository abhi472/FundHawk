package com.abhishek.fundhawk.ui.compare;

import com.abhishek.fundhawk.ui.search.SearchActivity;
import com.abhishek.fundhawk.ui.search.SelectedListAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class CompareFundActivityModule {

    @Provides
    CompareListAdapter provideListAdapter(CompareFundActivity activity) {
        return new CompareListAdapter(activity);
    }
}
