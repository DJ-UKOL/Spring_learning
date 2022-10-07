package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.stream.Stream;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> genresMusic() {
        return Stream.of(classicalMusic(), rockMusic(), rapMusic()).toList();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genresMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
