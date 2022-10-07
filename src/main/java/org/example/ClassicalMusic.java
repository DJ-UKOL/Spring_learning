package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }
    private List<String> songs = new ArrayList<>(Arrays.asList("Hungarian Rhapsody", "Ellis", "Buzz"));

    @Override
    public List<String> getSong() {
        return songs;
    }
}
