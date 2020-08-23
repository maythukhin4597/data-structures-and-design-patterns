package com.lone.first_example.state;

public abstract class Price {
    public abstract int getPrice();

    public abstract double getCharge(int daysRented);

    public int getFrequentPointers(int daysRented) {
        return 1;
    }

}
