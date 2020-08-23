package com.lone.first_example;

import lombok.Getter;

@Getter
public enum MovieGenre {

    REGEULAR(1),
    NEW_RELEASE(2),
    CHILDERN(3);

    int value;

    MovieGenre(int movie) {
        this.value = movie;
    }
}