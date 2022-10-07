package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(
            @Qualifier("rockMusic") Music music1,
            @Qualifier("rapMusic") Music music2,
            @Qualifier("classicalMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(Genre genre) {
        switch (genre) {
            case CLASSICAL -> {
                Collections.shuffle(music3.getSong());
                return "Playing " + music3.getSong().get(0);
            }
            case ROCK -> {
                Collections.shuffle(music1.getSong());
                return "Playing " + music1.getSong().get(0);
            }
            case RAP -> {
                Collections.shuffle(music2.getSong());
                return "Playing " + music2.getSong().get(0);
            }
        }
        return null;
    }
}
