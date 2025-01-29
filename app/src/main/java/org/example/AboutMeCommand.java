package org.example;

import picocli.CommandLine;

@CommandLine.Command(name = "about-me", description = "Displays about me information")
public class AboutMeCommand implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a fourth year comp sci student at Uvic.");
        System.out.println("I love coding, making music, working out, and games...");
    }
}
