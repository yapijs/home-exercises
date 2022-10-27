package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ClassOfStringUsingInterface implements MySimpleInterface {
    List<String> myList = new ArrayList<>();
    private int i;

    @Override
    public void add(int i, Object el) {
        myList.add(i, (String) el);
    }

    @Override
    public String get(int i) {
        return myList.get(i);
    }
}
