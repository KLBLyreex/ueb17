package main;

import java.util.Scanner;

public class FunctionDialog {

    private Scanner input = new Scanner(System.in);
    private Function function;

    //statische Variabeln
    private static final int Xhoch2 = 1;
    private static final int facultaet = 2;
    private static final int XhochX1 = 3;
    private static final int fibonacci = 4;
    private static final int ENDE = 0;

    private static final String Xhoch2_text = "f(x) = x^2";
    private static final String facultaet_text = "f(x) = x!";
    private static final String XhochX1_text = "f(x) = x^(x+1)";
    private static final String fibonacci_text = "f(x) = fib(x)";
    private static final String zahlEinlesen_unten = "Bitte geben Sie den Start an:";
    private static final String zahlEinlesen_oben = "Bitte geben Sie das Ende an:";


    public static void main(String[] args) {
        new FunctionDialog().start();
    }

    private void start(){
        function = null;
        int menu = -1;

        while(menu != ENDE){
            try {
                menu = einlesenFunktion();
                ausfuehren(menu);
            } catch (Exception e){
                System.out.println(e);
                input.nextLine();
            }
        }
    }

    private int einlesenFunktion(){
        System.out.println(
                "[" + Xhoch2 + "] " + Xhoch2_text + "\n"+
                "[" + facultaet + "] " + facultaet_text + "\n"+
                "[" + XhochX1 + "] " + XhochX1_text + "\n"+
                "[" + fibonacci + "] " + fibonacci_text + "\n"+
                "[" + ENDE + "] " + "ENDE" + "\n"
        );
        return input.nextInt();
    }

    private int einlesenZahlenUnten(){
        System.out.println(zahlEinlesen_unten);
        return input.nextInt();
    }

    private int einlesenZahlenOben(){
        System.out.println(zahlEinlesen_oben);
        return input.nextInt();
    }

    private void ausfuehren(int funktion){
        if (funktion == Xhoch2){
            function = bi();
        }else
        if (funktion == facultaet){
            function = bii();
        }else
        if (funktion == XhochX1){
            function = biii();
        }else
        if (funktion == fibonacci){
            function = biv();
         }else{
            System.out.println("Funktion steht nicht zur wahl!");
        }
    }
}
