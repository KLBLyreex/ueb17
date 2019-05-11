package main;


public class Function {

    public static void main(String[] args) {
        Function ff = new Function();
        ff.bi();
        System.out.println();
        ff.bii();
        System.out.println();
        ff.biii();
        System.out.println();
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
        applyAndPrint(xQuadratAnonym, 1, 10);

        System.out.println("\nX Quadrat als Lambda Ausdruck: ");
        MyFunction xQuadratLambda = i -> i * i;
        applyAndPrint(xQuadratLambda, 1, 10);
    }

    public void bii() {

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
        applyAndPrint(XHochXPlus1, 1, 10);

        System.out.println("\nX Hoch X Plus 1 als Lambda Ausdruck: ");
        MyFunction xhochxPlus1Lambda = x -> {
            int erg = x;
            for (int i = 1; i <= x + 1; i++) {
                erg *= x;
            }
            return erg;
        };
        applyAndPrint(xhochxPlus1Lambda, 1, 10);
    }

}
