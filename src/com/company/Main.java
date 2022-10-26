package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(suma(1,2,3));

        Coche miCoche = new Coche();
        System.out.println(miCoche.cantPuertas);
        miCoche.cantPuertas();
        miCoche.cantPuertas();
        miCoche.cantPuertas();
        System.out.println(miCoche.cantPuertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class Coche {
    public int cantPuertas = 4;

    public void cantPuertas(){
        this.cantPuertas++;
    }
}
