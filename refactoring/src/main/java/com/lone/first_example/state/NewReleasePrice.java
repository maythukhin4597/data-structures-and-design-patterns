package com.lone.first_example.state;

import com.lone.first_example.MovieGenre;

public class NewReleasePrice extends Price {
    @Override
    public int getPrice() {
        return MovieGenre.NEW_RELEASE.getValue();
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 2;
    }

    @Override
    public int getFrequentPointers(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
