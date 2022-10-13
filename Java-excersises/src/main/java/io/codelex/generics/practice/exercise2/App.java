package io.codelex.generics.practice.exercise2;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("ab");
        listOfStrings.add("cd");
        listOfStrings.add("de");
        System.out.println(concatenate(listOfStrings));


        List<String> listOfStrings2 = new ArrayList<>();
        listOfStrings2.add("word");
        System.out.println(concatenate(listOfStrings2));

        List<Integer> listOfInt= new ArrayList<>();
        listOfInt.add(1);
        System.out.println(concatenate(listOfInt));

        List<Object> listOfObj= new ArrayList<>();
        listOfObj.add(new Object());
        System.out.println(concatenate(listOfObj));
    }

    static <T> String concatenate(List<T> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (T el : list) {
            result = result + separator + el.toString();
        }
        return result;
    }


   /* This program is rejected by the Java compiler. Why?
        --funkcijā padotā list tips tiek salīdzināts ar List ar tipu, kas nav korekti. List<String> tips arī ir List.
        Pareizi būtu salīdzināt list saturu.
    Rewrite and compile the program. What are the results of executing the method passing each of the following:
    list of strings containing only one element "word"?
        -- liekas ok
    list of Integers containing only one element Integer(1)?
        -- liekas ok
    list of Objects containing only one element (initialized by new Object())?
        -- objektu neatpazīst, jo tāds nav nodefinēts.
    Is this behaviour consistent with what you would expect from the initial program? If not, how can you fix it?
        --šķiet, ka es jau esmu uzlabojis, un nelikas, ka te vēl ko var pielikt..
    What would happen if you tried to implement the different cases using method overloading instead of just one method. Why is this the case?
        -- būtu daudz koda (metožu) jāuzraksta, kas atkārtotos, kas nav vēlams.
    */

}
