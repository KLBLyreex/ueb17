package main;

import java.util.function.IntPredicate;
import java.lang.Math.*;

public class LambdaAusdruecke {

    public static MyFunction xFakultaetLambda = x -> {
        int ergebnis = 1;
        for (int i = 1; i <= x; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    };

    public static MyFunctionErweiterung xFakultaetLambda2 = x -> {
        int ergebnis = 1;
        for(int i = 1; i <= x; i++){
            ergebnis *= i;
        }
        return ergebnis;
    };

    public static MyFunction xhochxPlus1Lambda = x -> (int)Math.pow(x, x+1);


    public static MyFunction fibonacciLambda = x -> {
        int fibo1 = 0;
        int fibo2 = 0;
        int fibo3 = 0;
        for(int i = 1; i <= x; i++){
            fibo3 = fibo1+fibo2;
            fibo2 = fibo1;
            fibo1 = fibo3;
        }
        return fibo3;
    };

    public static IntPredicate even = x -> x % 2 == 0;

    public static MyFunction xQuadratLambda = i -> i * i;

    public static MyFunctionErweiterung xQuadratLambda2 = i -> i * i;
}
