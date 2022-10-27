package io.codelex.generics.practice.exercise1;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        SimpleObject task1 = new SimpleObject();
        task1.add(0, "String0");
        task1.add(1, BigDecimal.valueOf(116));
        System.out.println(task1.get(0));
        System.out.println(task1.get(1));
        //Vai nu speciāli jādefinē tips (un jātaisa jauna klase ar stikti nodefinētu tipu) katrai klasei vai jālieto Objekta tips.
        // Var miksēt objektu tipus, bet tas var novest pie problēmām.

        ClassOfStringUsingInterface task21 = new ClassOfStringUsingInterface();
        task21.add(0, "Some text value");
        task21.add(1, "Get some text");
        System.out.println(task21.get(0));
        System.out.println(task21.get(1));

        ClassOfIntegerUsingInterface task22 = new ClassOfIntegerUsingInterface();
        task22.add(0, 11);
        task22.add(1, 0);
        System.out.println(task22.get(0));
        System.out.println(task22.get(1));
        //Katrai klasei jādefinē savs tips -kods atkārtojas. Interfeisā paliek savukārt parent tips (lai šīs metodes derētu dažādām klasēm),
        // tādēļ var arī padot tipu, kas nemaz nekompilēsies.

        ClassWithGenerics<BigDecimal> task3 = new ClassWithGenerics<>();
        task3.add(0, BigDecimal.TEN);
        task3.add(1, BigDecimal.valueOf(165.1243));

        System.out.println(task3.get(0));
        System.out.println(task3.get(1));
        //Tikai to tipu, kas nodefinēts, var padot. IDE jau uzreiz parāda nepreizus tipus, ja tāds tiek padots. Kods īsāks un nedublējas.
    }
}
