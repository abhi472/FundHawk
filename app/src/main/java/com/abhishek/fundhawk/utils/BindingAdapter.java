package com.abhishek.fundhawk.utils;

import android.support.v4.widget.SwipeRefreshLayout;
import android.text.SpannableString;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import com.abhishek.fundhawk.R;

public class BindingAdapter {
    @android.databinding.BindingAdapter("isVisible")
    public static void isVisible(View view, Boolean status) {

        if (status)
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(View.GONE);

    }

    @android.databinding.BindingAdapter("isRefreshing")
    public static void isRefreshing(SwipeRefreshLayout view, Boolean status) {

        view.setRefreshing(status);

    }

    @android.databinding.BindingAdapter("textSpan")
    public static void textSpan(TextView textView, SpannableString string) {
        if (string != null)
            textView.setText(string);
    }

    @android.databinding.BindingAdapter("error")
    public static void error(AutoCompleteTextView textView, String string) {
        if (string != null)
            textView.setError(string);
    }
}
