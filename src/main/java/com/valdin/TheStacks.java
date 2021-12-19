package com.valdin;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args) {
        /* la Stack representa una pila de objetos LIFO, last in first out
        * */
        Stack<Integer> stack = new Stack<>();
        stack.push(1); //agrega un item al stack
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // retorna el top del stack
        System.out.println(stack.size()); // retorna el tamaño del stack
        System.out.println(stack.pop()); // retorna el top del stack y lo elimina
        System.out.println(stack.empty()); // retorna un boolen sobre si está vacío

    }
}
