package com.company;

public class Taxi {
    private String namefahrer;
    private String kennzeichen;
    private int nummer;
    /**
     * Der Konstruktor legt ein Taxi Objekt an und speichert darin den
     * Fahrernamen, das Kennzeichen und die Taxinummer.
     */
    public Taxi(String namefahrer, String kennzeichen, int nummer) {
        this.namefahrer = namefahrer;
        this.kennzeichen = kennzeichen;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "Das Taxi: " +
                  namefahrer+", "+
                  kennzeichen + ", "+
                  nummer ;

    }
}
