package Tarea1.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;

@Command(
        name = "StarWars",
        subcommands = {
                PeopleCommand.class,
                FilmsCommand.class,
                StarshipsCommand.class,
                PlanetsCommand.class,
                HelpCommand.class },
        description = "Star Wars API Client")
public class MainCommand implements Runnable {

    @Override
    public void run() {

    }
}
