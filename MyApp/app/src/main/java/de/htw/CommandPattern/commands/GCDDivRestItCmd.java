package de.htw.CommandPattern.commands;

import de.htw.Algorithms.GCDEuclidDivisionRestIt;
import de.htw.Algorithms.GCDEuclidSubtractionRec;
import de.htw.CommandPattern.ICommand;
import de.htw.MyApp.console.IConsole;

public class GCDDivRestItCmd implements ICommand {

    private IConsole console;
    private int gcd_x_y, x, y;

    public GCDDivRestItCmd(IConsole console) {
        this.console = console;
    }

    @Override
    public void execute() {
        this.x = console.readInteger("Please, enter a number for x:");
        this.y = console.readInteger("Please, enter a number for y:");

        this.gcd_x_y = GCDEuclidDivisionRestIt.gcd(x,y);

        console.write(toString());

    }

    @Override
    public String toString() {

        return "GCD Euclid division iterative of " + x + " and " + y + " is " + gcd_x_y;

    }
}
