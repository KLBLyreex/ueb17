package main;


import java.util.function.IntPredicate;

public class Function {

    private int i;
    private int j;

    public Function(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        Function ff = new Function(1, 10);
        ff.bii();
    }

    public static class FakultaetNestedClass {
        public static int FakultaetBerechnen(int x) {
            int ergebnis = 1;
            for (int i = 1; i <= x; i++) {
                ergebnis *= i;
            }
            return ergebnis;
        }
    }

    private void applyAndPrint(MyFunction myFunction, int i, int j) {
        for (int x = i; x <= j; x++) {
            System.out.println(x + ": " + myFunction.apply(x));
        }
    }

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

    public void biii() {
        MyFunction XHochXPlus1 = new MyFunction() {
            @Override
            public int apply(int x) {
                int erg = x;
                for (int i = 1; i <= x + 1; i++) {
                    erg *= x;
                }
                return erg;
            }
        };
        System.out.println("X Hoch X Plus 1 als Anonyme Klasse: ");
        applyAndPrint(XHochXPlus1, i, j);

        System.out.println("\nX Hoch X Plus 1 als Lambda Ausdruck: ");
        applyAndPrint(LambdaAusdruecke.xhochxPlus1Lambda, i, j);
    }

    public void iv() {
        MyFunction fibonacciAnonym = new MyFunction() {
            @Override
            public int apply(int x) {
                int fibo1 = 0;
                int fibo2 = 1;
                int fibo3 = 0;
                for (int i = 1; i <= x; i++) {
                    fibo3 = fibo1 + fibo2;
                    fibo2 = fibo1;
                    fibo1 = fibo3;
                }
                return fibo3;
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
