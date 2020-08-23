package com.lone.first_example.state;

import com.lone.first_example.MovieGenre;

public class ChildrenPrice extends Price {
    @Override
    public int getPrice() {
        return MovieGenre.CHILDERN.getValue();
    }

    @Override
    public double getCharge(int daysRented) {
        Double result = 3.0;
        if (daysRented > 3)
            result += (daysRented - 3) * 3;
        return result;
    }
}
