package main;


public class Function {


    public static void main(String[] args) {
        Function ff = new Function();
        ff.bi(0, 20);
        System.out.println();
        ff.bii(0, 20);
        System.out.println();
        ff.biii(0, 20);
        System.out.println();
        ff.biv(0, 20);
        System.out.println();
    }


    private void applyAndPrint(MyFunction myFunction, int i, int j) {
        for (int x = i; x <= j; x++) {
            System.out.println(x + ": " + myFunction.apply(x));
        }
    }

    public void bi(int i, int j) {
        MyFunction xQuadratAnonym = new MyFunction() {
            @Override
            public int apply(int x) {
                return x * x;
            }
        };

        System.out.println("X Quadrat als Anonyme Klasse: ");
        applyAndPrint(xQuadratAnonym, i, j);

        System.out.println("\nX Quadrat als Lambda Ausdruck: ");
        MyFunction xQuadratLambda = x -> x * x;
        applyAndPrint(xQuadratLambda, i, j);
    }

    public void bii(int i, int j) {
        MyFunction facAnonym = new MyFunction() {
            @Override
            public int apply(int x) {
                int ergebnis = 1;
                for (int i = 1; i <= x; i++) {
                    ergebnis = ergebnis * i;
                }
                return ergebnis;
            }
        };

        System.out.println("Fakultaet als Anonyme Klasse: ");
        applyAndPrint(facAnonym, i, j);
    }

    public void biii(int i, int j) {
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
            for (int k = 1; k <= x + 1; k++) {
                erg *= x;
            }
            return erg;
        };
        applyAndPrint(xhochxPlus1Lambda, i, j);
    }

    public void biv(int i, int j){
        MyFunction fib = new MyFunction() {
            @Override
            public int apply(int x) {
                if (x <= 2){
                    return (x > 0) ? 1 : 0;
                }else{
                    return apply(x-2)+apply(x-1);
                }
            }
        };
        System.out.println("Fibonacci als Anonyme Klasse: ");
        applyAndPrint(fib, i, j);

     //   MyFunction fibLambda = n -> {
      //      return n == 0 || n == 1 || n == 2 ? 1 : fibLambda.apply(n - 1) + fibLambda.apply(n - 2);
       // };
    }

}
