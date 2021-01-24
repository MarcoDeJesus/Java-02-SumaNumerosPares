package com.marcodejesus.qaminds;

public class Main {

    public static void main(String[] args) {

        int numero = 4;
        int suma = 2;

        while(numero <= 10){

            System.out.println("Numero + Suma: " + numero + " + " + suma + " = " + (numero+suma));
            
            suma = suma + numero;
            numero = numero + 2;
        }

        System.out.println("Suma pares entre 2 y 10 = " + suma);
    }
}