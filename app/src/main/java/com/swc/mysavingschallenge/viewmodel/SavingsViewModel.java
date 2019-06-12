package com.swc.mysavingschallenge.viewmodel;

import android.text.Editable;
import android.text.TextWatcher;

import com.swc.mysavingschallenge.databinding.ActivityMainBinding;
import com.swc.mysavingschallenge.model.Savings;
import com.swc.mysavingschallenge.viewmodel.adapter.WeeklySavingsAdapter;

public class SavingsViewModel {
    private Savings savings;
    private WeeklySavingsAdapter weeklySavingsAdapter;

    private boolean hasErrors = false;
    private String errors = "";

    public SavingsViewModel(final ActivityMainBinding activityMainBinding) {
        weeklySavingsAdapter = new WeeklySavingsAdapter(this);

        savings = new Savings();

        activityMainBinding.activityMainWeeksList.setAdapter(getWeeklySavingsAdapter());

        activityMainBinding.activityMainPrincipalAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int principal = 0;

                hasErrors = false;
                errors = "";

                try {
                    principal = Integer.parseInt(s.toString());
                } catch (NumberFormatException exception) {
                    errors = "Please enter a starting amount.";
                    hasErrors = true;
                }

                if (principal >= 0 && principal <= 5e7) {
                    savings.setPrincipal(principal);
                } else {
                    savings.setPrincipal(0);

                    errors = "Please enter an amount less than 50,000,000";
                    hasErrors = true;
                }


                weeklySavingsAdapter.setSavingsViewModel(SavingsViewModel.this);
                activityMainBinding.setSavingsViewModel(SavingsViewModel.this);
            }
        });

        this.errors = "";
    }

    public Savings getSavings() {
        return savings;
    }

    public void setSavings(Savings savings) {
        this.savings = savings;
    }

    public float getTotalSavings() {
        return (savings.getPrincipal() * 52 * 53 / 2f);
    }

    public int getWeekDeposit(int weekNumber) {
        return weekNumber * savings.getPrincipal();
    }

    public float getWeekTotal(int weekNumber) {
        return savings.getPrincipal() * weekNumber * (weekNumber + 1) / 2f;
    }

    public WeeklySavingsAdapter getWeeklySavingsAdapter() {
        return weeklySavingsAdapter;
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    public String getErrors() {
        return errors;
    }
}
