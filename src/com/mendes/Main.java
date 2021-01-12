package com.mendes;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("1", 1);
        treeMap.put("2", 2);
        treeMap.put("3", 3);
        treeMap.put("4", 4);
        treeMap.put("5", 5);

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("5");

        System.out.println(treeMap.comparator());
        System.out.println(treeSet.comparator());

        System.out.println("\nshow value until from first to second:");
        System.out.println(treeSet.subSet("2", "5"));
        System.out.println(treeMap.subMap("1", "4"));

        System.out.println("\nshow until three:");
        System.out.println(treeSet.headSet("3"));
        System.out.println(treeMap.headMap("3"));

        System.out.println("\nshow after four:");
        System.out.println(treeSet.tailSet("4"));
        System.out.println(treeMap.tailMap("4"));

        System.out.println("\nshow first value:");
        System.out.println(treeSet.first());
        System.out.println(treeMap.firstKey());

        System.out.println("\nshow last value:");
        System.out.println(treeSet.last());
        System.out.println(treeMap.lastKey());

        System.out.println("\nshow bigger value and small from three");
        System.out.println(treeSet.lower("3"));
        System.out.println(treeMap.lowerKey("3"));

        System.out.println("\nshow three, if there is not three, show big value and small from three:");
        System.out.println(treeSet.floor("2"));
        System.out.println(treeMap.floorKey("3"));

        System.out.println("\nshow three, if there is not three, show small value and big from three:");
        System.out.println(treeSet.ceiling("2"));
        System.out.println(treeMap.ceilingKey("3"));

        System.out.println("\nshow value after two:");
        System.out.println(treeSet.higher("2"));
        System.out.println(treeMap.higherKey("2"));

        System.out.println("\ngive first value and than delete:");
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);

        System.out.println("\ngive last value and than delete:");
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);

    }
}
