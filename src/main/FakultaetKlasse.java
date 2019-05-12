package main;

public class FakultaetKlasse {

    public static int FakultaetBerechnen(int x) {
        int ergebnis = 1;
        for (int i = 1; i <= x; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }
}
