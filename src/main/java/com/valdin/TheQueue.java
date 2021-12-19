package com.valdin;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueue {

    /* FIFO - first in first out
    * A collection designed for holding prior to process */
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alexander", 33));
        linkedList.add(new Person("María", 40));
        linkedList.addFirst(new Person("Isis", 65));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }
    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 33)); // cuando hay una restricción de capacidad usamos offer() en vez de add.
        supermarket.add(new Person("Isabel", 40));
        supermarket.add(new Person("Malva", 64));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }
    static record Person(String name, int age) {}
}
