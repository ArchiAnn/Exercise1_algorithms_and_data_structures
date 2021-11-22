package de.htw.Algorithms;

public class GCDEuclidDivisionRestIt {
    public static int gcd(int x, int y) {
        while (y != 0){
            int h = x % y;
            x = y;
            y = h;
        }
        return x;
    }
}
