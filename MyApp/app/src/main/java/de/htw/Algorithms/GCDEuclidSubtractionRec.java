package de.htw.Algorithms;

public class GCDEuclidSubtractionRec {

    public static int gcd(int x, int y) {

        if (y == 0) {
            return x;
        }
        else if (x == 0){
            return y;
        }
        else if (x > y) {
            return gcd(x - y, y);
        }
        else {
            return gcd( x, y - x);
        }

    }
}


