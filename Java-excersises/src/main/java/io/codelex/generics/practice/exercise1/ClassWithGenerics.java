package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ClassWithGenerics<T> {

    private final List<T> myList= new ArrayList<>();

    public void add(int i, T el) {
        myList.add(i, el);
    }

    public T get(int i) {
        return myList.get(i);
    }
}
