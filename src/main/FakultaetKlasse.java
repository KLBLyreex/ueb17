package main;

public class FakultaetKlasse {

    public static int FakultaetBerechnen(int x) {
        int ergebnis = x;
        for (int i = 1; i <= x; i++) {
            ergebnis *= x;
        }
        return ergebnis;
    }
}
