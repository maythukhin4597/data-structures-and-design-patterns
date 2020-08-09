package com.lone.first_example;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Rental {
    Movie movie;
    int daysRented;
}
