package com.valdin;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        /* A map cannot contain duplicate keys
        * Each key can man to at most one value  */

        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person("Alexander"));
        map.put(2,new Person("Isabel"));
        map.put(3,new Person("Mia"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + " " + person);
        });
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3, new Person("Julieta")));
    }

    record Person(String name) {}
}
