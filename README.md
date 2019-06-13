[![Build Status](https://travis-ci.org/dev-wanjihia/mysavingschallenge.svg?branch=master)](https://travis-ci.org/dev-wanjihia/mysavingschallenge)

# Safaricom 52 Week Savings Challenge


## Introduction

The challenge is to create an android application that predicts the amount that one is going to save after 52 weeks if they progressively keep adding the initial amount cumulatively over the weeks.

# Calculations

Determining the amount that one is required to save on a particular week.

Formula for calculating amount to deposit on week t given that the principal amount is n

deposit(t, n) = n * t

Formula for calculating the total amount that is going to have been saved on week t given a principal amount n

```
weekSaving(t, n) = n * t * (1 + t) / 2
```


Formula for calculating the total amount that is going to have been saved on the 52nd week given a principal amount n

```
totalSavings(n) = n * 26 * 53
```
