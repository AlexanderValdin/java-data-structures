package com.valdin;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TheSets {

    /* the Set is a collection that contains no duplicate elements and at most one null element
    As implied by its name, this interface models the mathematical set abstraction.
    *  */
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.forEach(System.out::println);
    }

    record Ball(String color) {}
}
