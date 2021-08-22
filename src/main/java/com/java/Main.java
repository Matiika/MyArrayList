package com.java;

public class Main {
    public static void main(String[] args) {

        String str = "##################";
        MyArrayList<Integer> intList = new MyArrayList<>();

        intList.add(10);
        intList.add(6);
        intList.add(2);
        intList.add(4);
        intList.add(8);

        intList.print();

        System.out.println(str);

        intList.getByIndex(0);
        intList.indexOf(4);

        intList.removeByIndex(1);
        intList.removeByObj(8);

        System.out.println(str);

        intList.print();

        System.out.println("Количество элементов в коллекции "+intList.size());

        intList.clear();
        intList.print();


    }
}
