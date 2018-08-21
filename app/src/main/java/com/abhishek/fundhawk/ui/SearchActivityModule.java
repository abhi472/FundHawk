package com.abhishek.fundhawk.ui;

import dagger.Module;
import dagger.Provides;

@Module
public class SearchActivityModule {

    @Provides
    SelectedListAdapter provideListAdapter(SearchActivity activity) {
        return new SelectedListAdapter(activity);
    }
}
