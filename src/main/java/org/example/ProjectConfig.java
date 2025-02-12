package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Mike");
        return parrot;
    }

    @Bean
    Parrot parrotKeuser(){
        Parrot parrot = new Parrot();
        parrot.setName("Keuser");
        return parrot;
    }

    @Bean
    @Primary
    Parrot parrotNurdaulet(){
        Parrot parrot = new Parrot();
        parrot.setName("Nurdaulet");
        return parrot;
    }

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

}
