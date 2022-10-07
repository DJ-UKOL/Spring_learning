package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.*;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    List<Music> genresMusic;

    public MusicPlayer(List<Music> genresMusic) {
        this.genresMusic = genresMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        return "Playing " + genresMusic.get(new Random().nextInt(genresMusic.size())).getSong();
        /*switch (genre) {
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
        return null;*/
    }
}
