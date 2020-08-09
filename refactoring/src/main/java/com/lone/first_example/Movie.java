package com.lone.first_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Movie {
    String title;
    int priceTag;

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