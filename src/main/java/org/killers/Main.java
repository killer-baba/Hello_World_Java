package org.killers;

import org.killers.datastructures.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.add(234);
        l1.add(345);
        l1.add(211);
        System.out.println(l1.size());
        l1.print();
        l1.remove(7);
        l1.print();
    }
}