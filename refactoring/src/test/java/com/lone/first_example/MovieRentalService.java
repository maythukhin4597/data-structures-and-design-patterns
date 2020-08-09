package com.lone.first_example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class MovieRentalService {

    @BeforeAll
    static void beforeAll() {
        System.out.println("**--- Executed once before all test methods in this class ---**");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("**--- Executed before each test method in this class ---**");
    }

    @Test
    public void shouldPrintStatementForACustomer() {
        String titanic = "titanic";
        String dark = "dark";
        Movie titanicMovie = new Movie(titanic, 1);
        Movie darkMovie = new Movie(dark, 1);
        Rental ju1Rent = new Rental(titanicMovie, 2);
        Rental ju2rent = new Rental(darkMovie, 3);

        Customer customer = new Customer();
        customer.setCustomerId("aaa");
        customer.setRentals(List.of(ju1Rent, ju2rent));

        String actualString = customer.statement();

        Assertions.assertEquals("Rental Record for aaa\n" +
                "\t"+titanic+"\t1.0\n" +
                "\t"+dark+"\t2.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 2 frequent renter points", actualString);
    }

    //assert equal
    //assert true
    //assert not null
    //assert all
    //assert throws
    //assume
    //use display name

}
