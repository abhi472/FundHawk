package com.abhishek.fundhawk.ui.compare;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhishek.fundhawk.R;
import com.abhishek.fundhawk.databinding.CompareCardsBinding;
import com.abhishek.fundhawk.databinding.SelectedFundCardBinding;
import com.abhishek.fundhawk.model.ComparisonBody;
import com.abhishek.fundhawk.model.SelectedFunds;
import com.abhishek.fundhawk.ui.search.SelectedListAdapter;
import com.abhishek.fundhawk.ui.search.SelectedListAdapterViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

public class CompareListAdapter extends RecyclerView.Adapter<CompareListAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ComparisonBody> items = new ArrayList<>();
    private ArrayList<String> companies = new ArrayList<>();

    @Inject
    public CompareListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CompareListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CompareCardsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context),
                R.layout.compare_cards,
                parent,
                false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CompareListAdapter.ViewHolder holder, int position) {

        CompareListAdapterViewModel viewModel = new CompareListAdapterViewModel();
        viewModel.setFields(items.get(holder.getAdapterPosition()), companies);
        holder.setViewModel(viewModel);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<ComparisonBody> items) {
        this.items = items;
    }

    public void setCompanies(ArrayList<SelectedFunds> funds) {
        for(SelectedFunds fund: funds) {
            companies.add(fund.getName());
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CompareCardsBinding binding;

        public ViewHolder(CompareCardsBinding itemView) {
            super(itemView.root);
            this.binding  = itemView;
        }

        public void setViewModel(CompareListAdapterViewModel viewModel) {
            binding.setViewModel(viewModel);
            binding.executePendingBindings();
        }
    }
}
