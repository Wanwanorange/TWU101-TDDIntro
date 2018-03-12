package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private final Account account = new Account(50);
    private double accountValue;

    @Before
    public void setUp() {
        accountValue = account.getBalance();
    }

    @Test
//    @Ignore  // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        assertThat(account.depositMoney(50), is(accountValue + 50));
    }


    @Test
//    @Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        assertThat(account.withdrawMoney(50), is(accountValue - 50));
    }

    @Test
//    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        assertThat(account.withdrawMoney(100), is((double)50));
    }
}
