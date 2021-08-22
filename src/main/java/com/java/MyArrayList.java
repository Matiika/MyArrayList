package com.java;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array= (T[]) new Object[10];
    private int size=0;

    public T getByIndex(int index) {
        checkIndex(index);
        System.out.println("Элемент по индексу "+index+": "+array[index]);
        return array[index];
    }

    public int indexOf(Object o){
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(array[i])){
                    System.out.println("Элемент "+o+" находится по индексу "+i);
                    return i;
                }
        }
        return -1;
    }

    public void add(T e) {
        if (size>=array.length){
            array= Arrays.copyOf(array,array.length*2);
        }
        array[size]=e;
        size++;
    }

    public boolean removeByIndex(int index) {
        checkIndex(index);
        for(int i=index; i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
        return true;
    }

    public boolean removeByObj(Object o) {
        for (int i=0; i<size; i++){
            if(array[i].equals(o)){
                removeByIndex(i);
            }
        }
       return true;
    }

    public int size() {
        return size;
    }

    public void print(){
        if (size==0){
            System.out.println("Коллекция пуста");
            return;
        }

        System.out.print("Элементы: ");
        for (int i=0; i<size; i++){
            System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }

    public void clear() {

        // clear to let GC do its work
        for (int i = 0; i < array.length; i++)
            array[i] = null;

        size = 0;
    }


    public void checkIndex(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

}
