package com.xworkz.jdbcapplication.runner;

public class ObjectRunner {
    public static void main(String[] args) {
        Object[] obj=new Object[2];
        obj[0]="";
        obj[1]=1;

        Object[] objects= new Object[1];
       // objects[0]="Custom Type";
        objects[0]=obj;
        for(Object o: objects){
            System.out.println(o);
        }


    }
}
