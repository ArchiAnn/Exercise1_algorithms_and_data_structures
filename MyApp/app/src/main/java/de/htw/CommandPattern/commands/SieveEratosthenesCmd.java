package de.htw.CommandPattern.commands;

import de.htw.Algorithms.GCDEuclidSubtractionIt;
import de.htw.Algorithms.SieveEratosthenes;
import de.htw.CommandPattern.ICommand;
import de.htw.MyApp.console.IConsole;

import java.util.ArrayList;

public class SieveEratosthenesCmd implements ICommand {

        private IConsole console;
        private int n;
        private ArrayList<Integer> liste = new ArrayList<Integer>();

    public SieveEratosthenesCmd(IConsole console) {
        this.console = console;
    }
    @Override
    public void execute() {
        this.n = console.readInteger("Please, enter a number for x:");

        this.liste = SieveEratosthenes.primes(n);

        console.write(toString());


    }

    @Override
    public String toString() {
    String result = "";

    for (int i = 0; i < liste.size(); i++) {
        result+= liste.get(i) + " ";
    }
        return "Sieve of Eratosthenes. Prime numbers till " + n + " are " + result ;
    }


}
