package de.htw.CommandPattern;

import de.htw.CommandPattern.commands.*;

import de.htw.MyApp.console.IConsole;

import java.util.LinkedList;

public class CommandFactory {
    private IConsole console;

    public CommandFactory(IConsole console) {
        this.console = console;
    }

    public LinkedList<ICommand> returnsCommands() {
        LinkedList<ICommand> commands = new LinkedList<ICommand>();
        commands.add(new ExitProgramCmd());
        commands.add(new GCDSubRecCmd(console));
        commands.add(new GCDSubItCmd(console));
        commands.add(new GCDDivRestRecCmd(console));
        commands.add(new GCDDivRestItCmd(console));
        commands.add(new SieveEratosthenesCmd(console));
        commands.add(new StringMatchingAlgorithmCmd(console));


        return commands;
    }

}
