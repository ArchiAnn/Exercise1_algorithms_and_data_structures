package de.htw.CommandPattern.commands;

import de.htw.Algorithms.StringMatchingAlgorithm;
import de.htw.CommandPattern.ICommand;
import de.htw.MyApp.console.IConsole;

public class StringMatchingAlgorithmCmd implements ICommand {

    private IConsole console;
    private String text = "I’m an egotistical bastard, and I name all my projects after myself. First ‘Linux’, now ‘Git’;";
    private String search = new String();


    public StringMatchingAlgorithmCmd(IConsole console) {
        this.console = console;
    }

    @Override
    public void execute() {

        this.text = console.readString("Please, enter text:");
        this.search = console.readString("Please, enter a search word or phrase:");
        console.write(toString()+StringMatchingAlgorithm.match(text, search));
    }

    @Override
    public String toString() {

        return "StringMatchingAlgorithm. \n";

    }
}
