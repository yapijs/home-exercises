package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ClassOfIntegerUsingInterface implements MySimpleInterface {
        List<Integer> myList = new ArrayList<>();
        private int i;

        @Override
        public void add(int i, Object el) {
            myList.add(i, (Integer) el);
        }

        @Override
        public Integer get(int i) {
            return myList.get(i);
        }
    }
