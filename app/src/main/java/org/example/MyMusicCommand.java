package org.example;

import picocli.CommandLine;

@CommandLine.Command(name = "music", description = "Info about my music")
public class MyMusicCommand implements Runnable {
    @Override
    public void run() {
        System.out.println("I make a lot of music in my free time!");
        System.out.println("I have produced songs for artists such as iAmJakeHill, sadeyes, and gaurdin!");
        System.out.println("Here is a link to my youtube channel: https://www.youtube.com/@prod.johnnyfriend");
    }
}
