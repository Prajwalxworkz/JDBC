package com.xworkz.jdbcapplication.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Runner {
    public static void main(String[] args) {
        int[] arr={2,22,222};
        Professor professor=new Professor();
        Collection collection= new ArrayList<>();
        collection.add('c');
        collection.add("India");
        System.out.println(collection);

       int size= collection.size();
        System.out.println(size);
    }
}
