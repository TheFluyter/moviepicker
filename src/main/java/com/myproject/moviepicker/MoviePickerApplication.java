package com.myproject.moviepicker;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MoviePickerApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(MoviePickerApplication.class);
        builder.headless(false);
        builder.run(args);
    }
}
