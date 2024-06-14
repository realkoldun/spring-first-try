package org.example.first_try;

import org.example.first_try.music_example.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                        "applicationContext.xml"
                );

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();
    }
}
