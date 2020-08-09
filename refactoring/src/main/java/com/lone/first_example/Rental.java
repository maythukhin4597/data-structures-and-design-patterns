package com.lone.first_example;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Rental {
    Movie movie;
    int daysRented;

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public int getFrequentPointers() {
        return movie.getFrequentPointers(daysRented);
    }
}
