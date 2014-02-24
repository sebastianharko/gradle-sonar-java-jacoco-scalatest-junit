package com.example.integration;

public class PrimeNumberHelper {

    private PrimeNumberHelper() {
        // empty constructor
    }

    public static boolean isPrime(int x) throws Exception {

        if (x == 0 ) {
            return false;
        }

        if ( x == 1 ) {
            return false;
        }

        if ( x > 1024 ) {
            throw new Exception("Numbers this big not supported yet :-) ");
        }

        boolean result = true;
        for(int i = 2; i < x; i++ ) {
            if ( (x % i) == 0) {
                result = false;
                break;
            }
        }

        return result;
    }


}