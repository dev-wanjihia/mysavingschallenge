package com.swc.mysavingschallenge;

import com.swc.mysavingschallenge.model.Savings;
import com.swc.mysavingschallenge.viewmodel.SavingsViewModel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SavingsChallengeUnitTest {

    @Test
    public void weeklyDepositIsCorrect() {
        SavingsViewModel savingsViewModel = new SavingsViewModel();

        Savings savings = new Savings();

        savings.setPrincipal(50);
        savingsViewModel.setSavings(savings);

        assertEquals(150, savingsViewModel.getWeekDeposit(3));
    }

    @Test
    public void weeklySavingsTotalIsCorrect() {
        SavingsViewModel savingsViewModel = new SavingsViewModel();

        Savings savings = new Savings();
        savings.setPrincipal(50);
        savingsViewModel.setSavings(savings);
        assertEquals(300, savingsViewModel.getWeekTotal(3), 0);
    }

    @Test
    public void totalSavingsIsCorrect() {
        SavingsViewModel savingsViewModel = new SavingsViewModel();

        Savings savings = new Savings();
        savings.setPrincipal(50);
        savingsViewModel.setSavings(savings);

        assertEquals(68900f, savingsViewModel.getTotalSavings(), 0.0f);
    }


}