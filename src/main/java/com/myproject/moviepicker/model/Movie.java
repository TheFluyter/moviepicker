package com.myproject.moviepicker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private String genre;
    private String director;

    private List<String> streamingAvailabilities;
    private BigDecimal streamingPrice;
}
