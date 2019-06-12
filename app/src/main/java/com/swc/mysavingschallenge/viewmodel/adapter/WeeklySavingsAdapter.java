package com.swc.mysavingschallenge.viewmodel.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.swc.mysavingschallenge.R;
import com.swc.mysavingschallenge.databinding.ListItemWeeklySavingBinding;
import com.swc.mysavingschallenge.model.WeeklySaving;
import com.swc.mysavingschallenge.viewmodel.SavingsViewModel;

public class WeeklySavingsAdapter extends RecyclerView.Adapter<WeeklySavingsAdapter.WeeklySavingViewHolder> {
    private SavingsViewModel savingsViewModel;

    public WeeklySavingsAdapter(SavingsViewModel savingsViewModel) {
        this.savingsViewModel = savingsViewModel;
    }

    public void setSavingsViewModel(SavingsViewModel savingsViewModel) {
        this.savingsViewModel = savingsViewModel;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public WeeklySavingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ListItemWeeklySavingBinding listItemWeeklySavingBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.list_item_weekly_saving,
                null, false);

        return new WeeklySavingViewHolder(listItemWeeklySavingBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WeeklySavingViewHolder weeklySavingViewHolder, int i) {
        weeklySavingViewHolder.setWeeklySaving(new WeeklySaving(i + 1, savingsViewModel.getWeekDeposit(i + 1), savingsViewModel.getWeekTotal(i + 1)));
    }

    @Override
    public int getItemCount() {
        return 52;
    }

    static class WeeklySavingViewHolder extends RecyclerView.ViewHolder {

        private ListItemWeeklySavingBinding weeklySavingBinding;

        public WeeklySavingViewHolder(ListItemWeeklySavingBinding weeklySavingBinding) {
            super(weeklySavingBinding.getRoot());
            this.weeklySavingBinding = weeklySavingBinding;
        }

        public void setWeeklySaving(WeeklySaving saving) {
            weeklySavingBinding.setWeeklySaving(saving);
        }
    }
}
