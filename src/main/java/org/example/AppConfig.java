package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("Movie1")
    public Movie getMovie1(){
        return new Movie(1,"Ram sita",5,"Romantic","this is movie");
    }

    @Bean("Movie2")
    public Movie getMovie2(){
        return new Movie(2,"Sanju",4,"Action","this is movie");
    }
}
