package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>(Arrays.asList("Hungarian Rhapsody", "Ellis", "Buzz"));

    @Override
    public List<String> getSong() {
        return songs;
    }
}
