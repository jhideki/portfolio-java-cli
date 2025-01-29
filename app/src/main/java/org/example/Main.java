package org.example;

import picocli.CommandLine;

@CommandLine.Command(name = "picolo", subcommands = {
        ProjectsCommand.class,
        AboutMeCommand.class,
        MyMusicCommand.class
})
public class Main implements Runnable {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println("Welcome to my Picolo CLI");
        System.out.println("Available arguments following arguments");
        System.out.println("projects");
        System.out.println("about-me");
        System.out.println("music");
    }
}
