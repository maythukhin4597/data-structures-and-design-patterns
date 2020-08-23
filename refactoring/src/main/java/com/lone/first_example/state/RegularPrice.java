package com.lone.first_example.state;

import com.lone.first_example.MovieGenre;

public class RegularPrice extends Price {
    @Override
    public int getPrice() {
        return MovieGenre.REGEULAR.getValue();
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1;
        if (daysRented > 2)
            result += (daysRented - 2);
        return result;
    }
}
