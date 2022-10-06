package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Обращаемся к конфигурационному файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();

        context.close();
    }
}
