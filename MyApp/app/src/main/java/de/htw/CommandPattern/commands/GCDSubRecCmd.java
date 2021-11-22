package de.htw.CommandPattern.commands;

import de.htw.Algorithms.GCDEuclidSubtractionRec;
import de.htw.CommandPattern.ICommand;
import de.htw.MyApp.console.IConsole;

public class GCDSubRecCmd implements ICommand {

    private IConsole console;
    private int gcd_x_y, x, y;

    public GCDSubRecCmd(IConsole console) {
        this.console = console;
    }

    @Override
    public void execute() {
        this.x = console.readInteger("Please, enter a number for x:");
        this.y = console.readInteger("Please, enter a number for y:");

        this.gcd_x_y = GCDEuclidSubtractionRec.gcd(x,y);

        console.write(toString());

    }

    @Override
    public String toString() {

        return "GCD Euclid subtraction recursive of " + x + " and " + y + " is " + gcd_x_y;

    }
}
