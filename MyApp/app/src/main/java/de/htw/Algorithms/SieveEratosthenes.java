package de.htw.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveEratosthenes {
    public static ArrayList<Integer> primes(int number) {
        ArrayList<Integer> primeZahlen = new ArrayList<Integer>();
        boolean[] zahlen = new boolean[number+1];
        Arrays.fill(zahlen, true);

        for(int i = 2; i<zahlen.length-1; i++){
            if (zahlen[i] == true){
                for(int j = i*2; j<zahlen.length; j=j+i){
                    zahlen[j] = false;
                }
            }
        }
        for (int i = 2; i<zahlen.length; i++){
            if(zahlen[i] == true){
                primeZahlen.add(i);
            }
        }
        return primeZahlen;
    }
}
