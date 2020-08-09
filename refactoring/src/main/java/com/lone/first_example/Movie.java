package com.lone.first_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import static com.lone.first_example.MovieGenre.*;

@Data
@AllArgsConstructor
public class Movie {
    String title;
    int priceTag;

    public double getCharge(int daysRented) {
        double result = 0.0;
        if (priceTag == REGEULAR.getValue()) {
            result += 1;
            if (daysRented > 2)
                result += (daysRented - 2);
        } else if (priceTag == NEW_RELEASE.getValue()) {
            result += daysRented * 2;
        } else if (priceTag == CHILDERN.getValue()) {
            result += 3;
            if (daysRented > 3)
                result += (daysRented - 3) * 3;
        }
        return result;
    }

    public int getFrequentPointers(int daysRented) {
        return (getPriceTag() == NEW_RELEASE.getValue() && daysRented > 1) ? 2 : 1;
    }
}

@Getter
enum MovieGenre {

    REGEULAR(1),
    NEW_RELEASE(2),
    CHILDERN(3);

    int value;

    MovieGenre(int movie) {
        this.value = movie;
    }
}