package de.htw.CommandPattern.commands;


public class ExitProgramCmd implements de.htw.CommandPattern.ICommand {

    @Override
    public void execute() {
    System.out.println(toString());
    }

    @Override
    public String toString() {
        return " End of the program";
    }
}
