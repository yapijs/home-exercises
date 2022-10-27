package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        add("first", stringList);
        add("second", stringList);
        stringList.forEach(System.out::println);

        List<Object> objectList = new ArrayList<>();
        add("someValue", objectList);

        objectList.forEach(System.out::println);

        addAllX(stringList, objectList);
        objectList.forEach(System.out::println);


        List<String> stringList2 = new ArrayList<>();
        add("someValue to second string list, because Object list do not accept it", stringList2);
        addAllY(stringList, stringList2);

        stringList2.forEach(System.out::println);
    }

    public static <V> void add(V value, List<V> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for(V el : v)  {
            l.add(el);
        }
    }
    public static <V> void addAllY(List<V> v, List<V> l) {
        for(V el : v)  {
            l.add(el);
        }
    }

}
/*    Explain why we obtain such an error.
        -- lietojot ? wildcard, nav iespējams rakstīt datus, jo nav zināms, kāda tipa objektus satur šis list.
 */
/*Fix the program by using a generic type for the parameter of method add and constraining the wildcard appropriately.
        We can use the following alternative signature for add: public <V> void add(V value, List<V> list)
        Is this solution more restricted than the one obtained using the wildcard?
*/