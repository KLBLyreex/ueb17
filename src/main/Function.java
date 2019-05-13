package main;


import java.util.function.IntPredicate;

/**
 * Klasse Function zur Ausfuerung verschiedener Funktionen mit Hilfe des Interfaces MyFunktion, auf verschiedene weisen
 * implementiert.
 */
public class Function {

    private int i;
    private int j;

    /**
     * Konstruktor fuer Function
     * @param i INTEGER Untere-Grenze
     * @param j INTEGER Obere.Grenze
     */
    public Function(int i, int j) {
        this.i = i;
        this.j = j;
    }

    /**
     * NestedClass zur Berechnung der Fakulteat
     */
    public static class FakultaetNestedClass {
        public static int FakultaetBerechnen(int x) {
            int ergebnis = 1;
            for (int i = 1; i <= x; i++) {
                ergebnis *= i;
            }
            return ergebnis;
        }
    }

    /**
     * applyAndPrint ruft die Uebergebene Funktion fuer alle Werte zwischen i und j auf und gibt diese ueber die Konsole
     * aus.
     * @param myFunction Auszufuehrende Funktion
     * @param i Untere-Grenze
     * @param j Obere-Grenze
     */
    private void applyAndPrint(MyFunction myFunction, int i, int j) {
        for (int x = i; x <= j; x++) {
            System.out.println(x + ": " + myFunction.apply(x));
        }
    }

    /**
     * xQuadrat berechnet fuer ein x, x^2
     */
    public void bi() {
        MyFunction xQuadratAnonym = new MyFunction() {
            @Override
            public int apply(int x) {
                return x * x;
            }
        };

        System.out.println("X Quadrat als Anonyme Klasse: ");
        applyAndPrint(xQuadratAnonym, i, j);

        System.out.println("\nX Quadrat als Lambda Ausdruck: ");
        applyAndPrint(LambdaAusdruecke.xQuadratLambda, i, j);
    }

    /**
     * xFakultaet berechnet die Fakultaet eines x.
     */
    public void bii() {
        MyFunction xFakultaet = new MyFunction() {
            @Override
            public int apply(int x) {
                int ergebnis = 1;
                for (int i = 1; i <= x; i++) {
                    ergebnis *= i;
                }
                return ergebnis;
            }
        };

        System.out.println("X Fakultaet als Anonyme Klasse: ");
        applyAndPrint(xFakultaet, i, j);

        System.out.println("\nX Fakultaet als Top Level Klasse: ");
        System.out.println("X Fakultaet von " + j + " = " + FakultaetKlasse.FakultaetBerechnen(j));

        System.out.println("\nX Fakultaet als Static Nested Class: ");
        System.out.println("X Fakultaet von " + j + " = " + FakultaetNestedClass.FakultaetBerechnen(j));

        System.out.println("\nX Fakultaet als Lambda-Ausdruck: ");
        applyAndPrint(LambdaAusdruecke.xFakultaetLambda, i, j);
    }

    /**
     * XHochXPlus1 berechnet x^(x+1) fuer einen uebergebene Zahl.
     */
    public void biii() {
        MyFunction XHochXPlus1 = new MyFunction() {
            @Override
            public int apply(int x) {
                return (int)Math.pow(x, x+1);
            }
        };
        System.out.println("X Hoch X Plus 1 als Anonyme Klasse: ");
        applyAndPrint(XHochXPlus1, i, j);

        System.out.println("\nX Hoch X Plus 1 als Lambda Ausdruck: ");
        applyAndPrint(LambdaAusdruecke.xhochxPlus1Lambda, i, j);
    }

    /**
     * fibonacci berechent die Fibonnaci Zahl einer uebergebenen Zahl
     */
    public void iv() {
        MyFunction fibonacciAnonym = new MyFunction() {
            @Override
            public int apply(int x) {
                if (x<=0)
                    return 0;
                if (x==1)
                    return 1;
                else
                    return apply(x-2)+apply(x-1);
            }
        };

        System.out.println("Fibonacci-Folge als Anonyme Klasse: ");
        applyAndPrint(fibonacciAnonym, i, j);
        System.out.println("\nFibonacci-Folge als Lambda Ausdruck: ");
        applyAndPrint(LambdaAusdruecke.fibonacciLambda, i, j);
    }

    IntPredicate odd = new IntPredicate() {
        @Override
        public boolean test(int value) {
            return value % 2 == 1;
        }
    };

    public void aufgabeE() {
        System.out.println("Lambda-Ausdruck fuer die Quadrat Zahl von geraden Zahlen: ");
        applyAndPrint(LambdaAusdruecke.xQuadratLambda2.conditionateInput(LambdaAusdruecke.even), i, j);
    }

    public void aufgabeF() {
        System.out.println("Lambda-Ausdruck bei der die Fakultaet gerade ist: ");
        applyAndPrint(LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(LambdaAusdruecke.even), i, j);

        System.out.println("Lambda-Ausdruck bei der die Fakultaet ungerade ist: ");
        applyAndPrint(LambdaAusdruecke.xFakultaetLambda2.condiitionateOutput(odd), i, j);
    }

}
