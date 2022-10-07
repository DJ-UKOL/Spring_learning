package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>(Arrays.asList("Wind cries Mary", "I'm free", "Go go go"));

    @Override
    public List<String> getSong() {
        return songs;
    }
}
