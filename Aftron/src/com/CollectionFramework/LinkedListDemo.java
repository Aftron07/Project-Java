package com.CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(100);
        ll.add(50);
        ll.add(150);
        ll.add(99);
        ll.add(25);
        ll.add(1, 999); 

       
        System.out.println(ll);
    }
}


