package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FunctionDialog {

    private Scanner input = new Scanner(System.in);
    private Function function;

    //statische Variabeln
    private static final int Xhoch2 = 1;
    private static final int facultaet = 2;
    private static final int XhochX1 = 3;
    private static final int fibonacci = 4;
    private static final int evenQuadrat = 5;
    private static final int evenFakultaet = 6;
    private static final int ENDE = 0;

    private static final String Xhoch2_text = "f(x) = x^2";
    private static final String facultaet_text = "f(x) = x!";
    private static final String XhochX1_text = "f(x) = x^(x+1)";
    private static final String fibonacci_text = "f(x) = fib(x)";
    private static final String evenQuadrat_text = "Quadratzahl fuer gerade Zahlen";
    private static final String evenFakultaet_text = "Trennen Fakultaet einer Zahl in Gerade bzw. ungerade";
    private static final String zahlEinlesen_unten = "Bitte geben Sie den Start an:";
    private static final String zahlEinlesen_oben = "Bitte geben Sie das Ende an:";

    /**
     * Ruf Methode start auf.
     * @param args Beim Programmstart uebergebene Argumente
     */
    public static void main(String[] args) {
        new FunctionDialog().start();
    }

    /**
     * Methode start Legt eine Function (function) an, führt die Funktion aus,
     * die vom Nutzer in der Methode einlesenFunktion gewählt wurde.
     * Sollte der Nutzer eine falsche Eingabe machen, wird diese hier gefangen.
     */
    private void start(){

        int menu = -1;

        while(menu != ENDE){
            try {
                System.out.println("===============");
                int i = einlesenZahlenUnten();
                int j = einlesenZahlenOben();
                function = new Function(i, j);
                menu = einlesenFunktion();
                ausfuehren(menu);
            } catch (InputMismatchException mismatchException){
                System.out.println("Ihre Eingabe hat einen Fehler im Program ausgelöst. Bitte überprüfen Sie Ihre Eingabe " +
                        "und versuchen Sie es erneut.");
                input.nextLine();
            } catch (Exception e){
                System.out.println(e);
                input.nextLine();
            }
        }
    }

    /**
     * Methode einlesenFunktion Zeigt dem Nutzer eine Auswahl an Funktionen und ließt seine Wahl ein.
     *
     * @return Der Rückgabewert, Funktionswahl des Nutzers
     */
    private int einlesenFunktion(){
        System.out.println(
                "[" + Xhoch2 + "] " + Xhoch2_text + "\n"+
                "[" + facultaet + "] " + facultaet_text + "\n"+
                "[" + XhochX1 + "] " + XhochX1_text + "\n"+
                "[" + fibonacci + "] " + fibonacci_text + "\n"+
                "[" + evenQuadrat + "] " + evenQuadrat_text + "\n"+
                "[" + evenFakultaet + "] " + evenFakultaet_text + "\n"+
                "[" + ENDE + "] " + "ENDE" + "\n"
        );
        return input.nextInt();
    }

    /**
     * Methode liest die Untere-Schranke.
     * @return Untere-Schranke
     */
    private int einlesenZahlenUnten(){
        System.out.println(zahlEinlesen_unten);
        return input.nextInt();
    }

    /**
     * Methode liest die Obere-Schranke.
     * @return Obere-Schranke
     */
    private int einlesenZahlenOben(){
        System.out.println(zahlEinlesen_oben);
        return input.nextInt();
    }

    /**
     * Methode ausfuehren Bekommt die vom Nutzer gewählte Funktion von der Methode start übergeben
     * und führt die zur Funktion gehörige Methode aus.
     *
     * @param funktion Funktionswahl des Nutzers
     */
    private void ausfuehren(int funktion){
        if (funktion == Xhoch2){
            function.xQuadrat();
        }else
        if (funktion == facultaet){
            function.xFakulteat();
        }else
        if (funktion == XhochX1){
            function.xHochXPlus1();
        }else
        if (funktion == fibonacci){
            function.fibonacci();
        }else
        if (funktion == evenQuadrat){
            function.xQuadratEven();
        }else
        if (funktion == evenFakultaet){
            function.fakultaetEven();
        }else
        if (funktion == ENDE){
            System.out.println("ENDE!");
        }else{
            System.out.println("Funktion steht nicht zur wahl!");
        }
    }
}
