package com.lone.first_example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

import static com.lone.first_example.MovieGenre.*;

@Data
@NoArgsConstructor
public class Customer {
    String customerId;
    List<Rental> rentals;

    public String statement() {
        double totalAmount = 0.0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + getCustomerId() + "\n");
        for (Rental aRental : rentals) {
            double thisAmount = 0.0;
            int priceTag = aRental.getMovie().getPriceTag();
            if (priceTag == REGEULAR.getValue()) {
                thisAmount += 1;
                if (aRental.getDaysRented() > 2)
                    thisAmount += (aRental.getDaysRented() - 2);
            } else if (priceTag == NEW_RELEASE.getValue()) {
                thisAmount += aRental.getDaysRented() * 2;
            } else if (priceTag == CHILDERN.getValue()) {
                thisAmount += 3;
                if (aRental.getDaysRented() > 3)
                    thisAmount += (aRental.getDaysRented() - 3) * 3;
            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((aRental.getMovie().getPriceTag() == NEW_RELEASE.getValue())
                    && aRental.getDaysRented() > 1)

                frequentRenterPoints++;
            //show figures for this rental
            result.append("\t").append(aRental.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return result.toString();
    }

    public Customer(List<Rental> rentals) {
        this.customerId = RandomStringUtils.randomAlphanumeric(6);
        this.rentals = rentals;
    }
}
