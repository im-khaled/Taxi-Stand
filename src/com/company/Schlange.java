package com.company;

public class Schlange {
    private int front;
    private static int nextFree;
    private Taxi[] arr;

    public Schlange(int nextFree, int front) {
        this.front=front;
        this.nextFree = nextFree;
        arr = new Taxi[5];

    }
    public void clear() {
        if(front==nextFree)
            System.out.println("Alle 5 Platze sind Frei");

        arr[0]=null;
        arr[1]=null;
        arr[2]=null;
        arr[3]=null;
        arr[4]=null;
        nextFree=0;
    }
    public void ausgeben() {

        if (front == nextFree) {
            System.out.printf("%n");

        } {
            System.out.printf("%n");
            for (int i = 0; i < nextFree; i++) {
                System.out.println("Taxistand: "+(i+1));

            }
            System.out.printf("%n");
            for(int j= 0; j<arr.length; j++){
                if (arr[j] == null)
                    System.out.println("Taxistand: "+(j+1)+" ist frei");
            }
        }
    }
    public void enqueue(Taxi x) {
        if (nextFree < 5) {
            arr[nextFree] = x;
            System.out.println(arr[nextFree]+" fährt auf Platz "+(nextFree+1));
            nextFree++;

        }else {
            System.out.println("Alle Plätz sind Voll "+x+" kann nicht fahren.");
        }
    }
    public void dequeue() {
        if (nextFree == front)
            System.out.println("Taxistand: null\null\null\null\null");
        else {
            nextFree--;
            arr[nextFree] = null;
        }
    }
}