package com.valdin;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();
        /* Al instanciar una Arraylist de la interface List implementamos sus métodos */
        colores.add("azul");
        colores.add("rojo");
        colores.add("amarillo");

        System.out.println(colores.size());
        System.out.println(colores.contains("verde"));
        System.out.println(colores.contains("rojo"));
        System.out.println(colores);

        for (String color : colores) {
            System.out.println(color);
        }

        colores.forEach(System.out::println);

        List<String> coloresInmodificables = List.of(
                "verda", "negro", "blanco"
        );
     }
}
