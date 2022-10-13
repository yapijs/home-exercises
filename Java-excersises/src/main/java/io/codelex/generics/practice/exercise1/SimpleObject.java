package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class SimpleObject {
    private final List<Object> myList= new ArrayList<>();

    public void add(int i, Object el) {
        myList.add(i, el);
    }

    public Object get(int i) {
        return myList.get(i);
    }
}
