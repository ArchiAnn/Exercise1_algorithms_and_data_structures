/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.htw.MyApp;

import de.htw.CommandPattern.CommandFactory;
import de.htw.MyApp.console.impl.Console;

public class App {
    public String getGreeting() {

        return  "Console-Application: Exercise-1                        Anna Khalikova 580546\n\n\n" +
                " 1. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction.\n" +
                " 2. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.\n" +
                " 3. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.\n" +
                " 4. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.\n" +
                " 5. Sieve of Eratosthenes.\n" +
                " 6. Search for a specific string in Linus Torvald's joke (String-MatchingAlgorithm).\n" +
                " 0. Exit.\n\n";
    }




    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Console console = new Console();
        CommandFactory cmds = new CommandFactory(console);

        int option = console.readInteger(" Please enter a number for an option:");
        if(option < 7 && option>=0){
            cmds.returnsCommands().get(option).execute();
        }
        else{
            option = console.readInteger(" Please enter a number for an option:");
        }
        }

}
