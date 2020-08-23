package com.lone.first_example;

import com.lone.first_example.state.ChildrenPrice;
import com.lone.first_example.state.NewReleasePrice;
import com.lone.first_example.state.Price;
import com.lone.first_example.state.RegularPrice;
import lombok.Getter;
import lombok.Setter;

import static com.lone.first_example.MovieGenre.*;

public class Movie {
    @Setter
    @Getter
    String title;

//    int priceTag;

    Price price;

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentPointers(int daysRented) {
        return price.getFrequentPointers(daysRented);
    }

    public Movie(String title, int priceTag) {
        this.title = title;
        setPriceTag(priceTag);
    }

    public void setPriceTag(int price) {
        if (price == REGEULAR.getValue()) {
            this.price = new RegularPrice();
        } else if (price == NEW_RELEASE.getValue()) {
            this.price = new NewReleasePrice();
        } else if (price == CHILDERN.getValue()) {
            this.price = new ChildrenPrice();
        }
    }

    public int getPriceTag() {
        return price.getPrice();
    }

}

