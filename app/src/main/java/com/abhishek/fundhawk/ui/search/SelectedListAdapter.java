package com.abhishek.fundhawk.ui.search;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.abhishek.fundhawk.R;
import com.abhishek.fundhawk.databinding.SelectedFundCardBinding;
import com.abhishek.fundhawk.model.SearchResult.SearchResult;

import java.util.ArrayList;

import javax.inject.Inject;

public class SelectedListAdapter extends RecyclerView.Adapter<SelectedListAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SearchResult> searchResultList = new ArrayList<>();



    @Inject
    public SelectedListAdapter(Context context) {
        this.context = context;
    }

    public void setSearchResultList(ArrayList<SearchResult> searchResultList) {
        this.searchResultList = searchResultList;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public SelectedListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        SelectedFundCardBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context),
                R.layout.selected_fund_card,
                parent,
                false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectedListAdapter.ViewHolder holder, int position) {

        SelectedListAdapterViewModel viewModel = new SelectedListAdapterViewModel();
        viewModel.setFields(searchResultList.get(holder.getAdapterPosition()));
        holder.setViewModel(viewModel);
        holder.binding.clear.setOnClickListener(view -> {
            searchResultList.remove(holder.getAdapterPosition());
            notifyDataSetChanged();
        });

    }

    @Override
    public int getItemCount() {
        return searchResultList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        SelectedFundCardBinding binding;

        public ViewHolder(SelectedFundCardBinding itemView) {
            super(itemView.root);
            this.binding  = itemView;
        }

        public void setViewModel(SelectedListAdapterViewModel viewModel) {
            binding.setViewModel(viewModel);
            binding.executePendingBindings();
        }
    }
}
