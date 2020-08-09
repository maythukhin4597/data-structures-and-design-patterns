package com.lone.first_example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

@Data
@NoArgsConstructor
public class Customer {
    String customerId;
    List<Rental> rentals;

    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + getCustomerId() + "\n");
        for (Rental aRental : rentals) {
            result.append("\t").append(aRental.getMovie().getTitle()).append("\t").append(aRental.getCharge()).append("\n");
        }
        //add footer lines
        result.append("Amount owed is ").append(getTotalCharge()).append("\n");
        result.append("You earned ").append(getTotalFrequentPointers()).append(" frequent renter points");
        return result.toString();
    }

    public Customer(List<Rental> rentals) {
        this.customerId = RandomStringUtils.randomAlphanumeric(6);
        this.rentals = rentals;
    }

    public double getTotalCharge() {
        double result = 0.0;
        for (Rental aRental : rentals) {
            result += aRental.getCharge();
        }
        return result;
    }

    public int getTotalFrequentPointers() {
        int result = 0;
        for (Rental aRental : rentals) {
            result += aRental.getFrequentPointers();
        }
        return result;
    }
}
