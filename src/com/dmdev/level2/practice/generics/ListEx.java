package com.dmdev.level2.practice.generics;

import java.util.Iterator;

public class ListEx<T> implements Iterable<T> {

    private T[] objects;
    private int size;

    public ListEx(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }


    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
