package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music {

    private List<String> songs = new ArrayList<>(Arrays.asList("Candy Shop", "Stan", "Are you ready?"));

    @Override
    public List<String> getSong() {
        return songs;
    }
}
