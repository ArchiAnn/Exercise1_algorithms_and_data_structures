package de.htw.Algorithms;

public class GCDEuclidSubtractionIt {
    public static int gcd(int x, int y) {
        if(x == 0){
            return y;
        }
        else{ while (y != 0){
                if (x>y){
                    x = x - y;
                }
                else{
                    y = y - x;
                }
            }
        }
        return x;
    }
}
