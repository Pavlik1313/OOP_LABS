package com.company;

import java.util.*;

public class MyList implements List<Train> {
    private int size = 0;
    private static final int INITIAL_SIZE = 15;
    private Train[] train = new Train[INITIAL_SIZE];


    @Override
    public int size() {
        return size;
    }


    public void increaseCapacity(double factor) {
        if (factor > 1) {
            Train[] temp = Arrays.copyOf(train, train.length);
            train = new Train [(int) (INITIAL_SIZE * factor)];
            addAll(Arrays.asList(temp));
        }
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public boolean contains(Object obj) {
        if (obj instanceof Train) {
            for (int i = 0; i < size; i++) {
                if (train[i].equals(obj)) return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Train> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Train next() {
                return train[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return train;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean add(Train elm) {
        if (size >= train.length) {
            increaseCapacity(1.3);
        }
        train[size++] = elm;
        return true;
    }

    @Override
    public void add(int index, Train elm) {
        train[index] = elm;
    }


    @Override
    public boolean remove(Object obj) {
        if (obj instanceof Train) {
            for (int i = 0; i < size; i++) {
                if (train[i].equals(obj)) {
                    train[i] = train[size - 1];
                    train[--size] = null;
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public boolean containsAll(Collection<?> c){
        boolean flag;
        for (Object obj: c){
            flag = false;
            for (int i = 0; i < size; i++){
                if (train[i].equals(obj)){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                return false;
            }

        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Train> c){
        int sizeBeforeOperation = size;
        c.forEach(this::add);
        return sizeBeforeOperation != size;
    }


    @Override
    public boolean addAll(int index, Collection<? extends Train> c){
        int sizeBeforeOperation = size;
        int i=0;
        for (Train obj : c){
            if (index+i >= train.length) {
                increaseCapacity(1.3);
            }
            train[index+i] = obj;
            i++;
        }
        if (index+i > size){size = index+i;}

        return sizeBeforeOperation != size;
    }


    @Override
    public boolean removeAll(Collection<?> c) {
        int sizeBeforeOperation = size;
        c.forEach(this::remove);
        return sizeBeforeOperation != size;
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        int sizeBeforeOperation = size;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (Object obj : c) {
                if (train[i].equals(obj)) {
                    train[counter++] = train[i];
                }
            }
        }
        for (int i = counter; i < size; i++) {
            train[i] = null;
        }
        size = counter;
        return sizeBeforeOperation != size;
    }


    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            train[i]= null;
        }
        size = 0;
    }


    @Override
    public Train get(int i){return train[i];}


    @Override
    public Train set(int i, Train obj){
        train[i] = obj;
        return obj;
    }


    @Override
    public Train remove(int index){
        Train[] temp = train;
        int k = 0;
        for (int i=0; i < size; i++){
            if (i == index){
                continue;
            }
            train[i] = temp[k];
            k++;
        }
        return temp[index];
    }


    @Override
    public int indexOf(Object obj){
        for (int i = 0; i < size; i++){
            if (train[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj){
        for (int i = size; i >= 0; i--){
            if (train[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }



    @Override
    public ListIterator listIterator ()  {
     return null;
    }

    @Override
    public ListIterator listIterator (int i)  {
        return null;
    }

    @Override
    public List<Train> subList(int s, int e){
        MyList output = new MyList();
        for (int i = s; i < e; i++){
            output.add(train[i]);
        }
        return output;
    }
}
