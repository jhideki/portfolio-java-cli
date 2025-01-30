package org.example;

import picocli.CommandLine;

@CommandLine.Command(name = "projects", description = "Displays project details", subcommands = {
        ProjectsCommand.Pywal.class,
        ProjectsCommand.Discard.class,
        ProjectsCommand.Duckling.class
})
public class ProjectsCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("Here are some projects I have built/am working on:");
        System.out.println("pywal-spicetify");
        System.out.println("discard");
        System.out.println("palword-api");
        System.out.println("duckling-dash");
        System.out.println("");
        System.out.println("For more info on my projects run the pass in the following:");
        System.out.println("e.g. args='projects discard'");

    }

    @CommandLine.Command(name = "pywal-spicetify", description = "pywal")
    static class Pywal implements Runnable {
        public void run() {
            System.out.println("pywal-spicetify: ");
            System.out
                    .println("This is a CLI tool that allows users to apply pywal colors to spicetify in Linux rices.");
            System.out.println("https://github.com/jhideki/pywal-spicetify");
        }
    }

    @CommandLine.Command(name = "discard", description = "discard")
    static class Discard implements Runnable {
        public void run() {
            System.out.println("Discard:");
            System.out.println(
                    "A application that replicates Discord's features but operates entirely on a peer-to-peer (P2P) network.");
            System.out.println("All data is transferred directly between users and stored locally on their devices.");
            System.out.println("https://github.com/jhideki/discard");
        }
    }

    @CommandLine.Command(name = "duckling-dash", description = "duckling")
    static class Duckling implements Runnable {
        public void run() {
            System.out.println("Duckling Dash:");
            System.out.println("This is a game jam submission for Pirate Software game jam 13!");
            System.out.println("You can play the game here: https://johnnyfriend.itch.io/dukcy-test");
            System.out.println("The game placed 100th out of 1390 entries in the playability category!");
            System.out.println("https://github.com/jhideki/duckling-dash");
        }
    }
}
