package main;


public class Function {

    private int i;
    private int j;

    public Function(int i, int j){
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        Function ff = new Function(1, 10);
        ff.bi();
        System.out.println();
        ff.bii();
        System.out.println();
        ff.biii();
        System.out.println();
        ff.iv();
    }

    public static class FakultaetNestedClass{
        public static int FakultaetBerechnen(int x) {
            int ergebnis = x;
            for (int i = 1; i <= x; i++) {
                ergebnis *= x;
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
        MyFunction xQuadratLambda = i -> i * i;
        applyAndPrint(xQuadratLambda, i, j);
    }

    public void bii() {
        MyFunction xFakultaet = new MyFunction() {
            @Override
            public int apply(int x) {
                int ergebnis = x;
                for (int i = 1; i <= x; i++) {
                    ergebnis *= x;
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
        MyFunction xFakultaetLambda = x -> {
            int ergebnis = x;
            for (int i = 1; i <= x; i++) {
                ergebnis *= x;
            }
            return ergebnis;
        };
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
        MyFunction xhochxPlus1Lambda = x -> {
            int erg = x;
            for (int i = 1; i <= x + 1; i++) {
                erg *= x;
            }
            return erg;
        };
        applyAndPrint(xhochxPlus1Lambda, i, j);
    }

    public void iv() {
        MyFunction fibonacciAnonym = new MyFunction() {
            @Override
            public int apply(int x) {
                int fibo1 = 0;
                int fibo2 = 1;
                int fibo3 = 0;
                for(int i = 1; i <= x; i++){
                    fibo3 = fibo1+fibo2;
                    fibo2 = fibo1;
                    fibo1 = fibo3;
                }
                return fibo3;
            }
        };

        System.out.println("Fibonacci-Folge als Anonyme Klasse: ");
        applyAndPrint(fibonacciAnonym, i, j);
        System.out.println("\nFibonacci-Folge als Lambda Ausdruck: ");
        MyFunction fibonacciLambda = x -> {
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
        applyAndPrint(fibonacciLambda, i, j);
    }

}
