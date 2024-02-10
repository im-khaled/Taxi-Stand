package com.company;

public class Main {
    public static void main(String args[]) {
        Taxi a = new Taxi("Frank Victor ", "BN – FV",  300);
        Taxi b = new Taxi("Angela Merkel ", "B - DE",  500);
        Taxi c = new Taxi("James Bond ", "BN - JB",  699);
        Taxi d = new Taxi("Manuel Neuer ", "M - MN",  1254);
        Taxi e = new Taxi("Angelique Kerber ", "BN - AK",  111);
        Taxi f = new Taxi("Boris Becker ", "M - BB", 4911);
        Taxi g = new Taxi("Tim Harison ", "T - ZZ", 5010);
        Taxi h = new Taxi("Paul Petter ", "P - MH", 6020);

        Schlange taxistand = new Schlange(0, 0); // Nächster freier Platz

        System.out.println("Ausgangssituation");
        taxistand.clear(); // leert den Taxistand
        taxistand.ausgeben(); // zeigt den Taxistand (siehe Ausgabe)
        System.out.printf("%n%n1. Situation%n");
        taxistand.clear(); // leert den Taxistand
        taxistand.enqueue(a);
        taxistand.enqueue(b);
        taxistand.enqueue(c);
        taxistand.enqueue(d);
        taxistand.enqueue(e);
        taxistand.enqueue(f);

        System.out.printf("%n%n2. Situation%n");
        taxistand.clear();
        taxistand.ausgeben();
        taxistand.enqueue(f);
        taxistand.enqueue(a);
        taxistand.enqueue(b);
        taxistand.ausgeben();

        System.out.printf("%nEin Taxi entlässt den Taxistand");
        taxistand.dequeue();
        taxistand.ausgeben();

        taxistand.enqueue(g);
        taxistand.enqueue(h);
        taxistand.ausgeben();

    }
}
