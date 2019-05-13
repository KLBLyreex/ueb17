package main;

import java.util.function.IntPredicate;

public class LambdaAusdruecke {
    /**
     * Berechnet die Fakultaet von x mit einem Lambda-Ausdruck
     */
    public static MyFunction xFakultaetLambda = x -> {
        int ergebnis = 1;
        for (int i = 1; i <= x; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    };

    /**
     * Berechnet die Fakultaet von x mit einem Lambda-Ausdruck
     */
    public static MyFunctionErweiterung xFakultaetLambda2 = x -> {
        int ergebnis = 1;
        for(int i = 1; i <= x; i++){
            ergebnis *= i;
        }
        return ergebnis;
    };

    /**
     * Berechnet x^(x+1) mit einem Lambda-Ausdruck
     */
    public static MyFunction xhochxPlus1Lambda = x -> (int)Math.pow(x, x+1);

    /**
     * Berechnet die Fibonacci Zahl mit einem Lambda-Ausdruck
     */
    public static MyFunction fibonacciLambda = x -> {
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3 = 0;
        for(int i = 1; i <= x; i++){
            fibo3 = fibo1+fibo2;
            fibo2 = fibo1;
            fibo1 = fibo3;
        }
        return fibo3;
    };

    /**
     * Ueberprueft ob eine Zahl gerde ist
     */
    public static IntPredicate even = x -> x % 2 == 0;

    /**
     * Berechnet x^2 mit einem Lambda-Ausdruck
     */
    public static MyFunction xQuadratLambda = i -> i * i;

    /**
     * Berechnet x^2 mit einem Lambda-Ausdruck
     */
    public static MyFunctionErweiterung xQuadratLambda2 = i -> i * i;
}
