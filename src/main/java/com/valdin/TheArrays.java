package com.valdin;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] colores = new String [5];
        colores[0] = "púrpura";
        colores[1] = "azul";
        colores[2] = "rojo";

        System.out.println(Arrays.toString(colores));

        System.out.println(colores[0]);
        System.out.println(colores[1]);
        System.out.println(colores[2]);
        System.out.println(colores[3]);
        System.out.println(colores[4]);

        for (int i=0;i < colores.length; i++) {
            System.out.println(colores[i]);
        }

        for (int i = colores.length -1; i >=0; i--) {
            System.out.println(colores[i]);
        }

        for (String color : colores) {
            System.out.println(color);
        }

        Arrays.stream(colores).forEach(System.out::println);
    }
}
