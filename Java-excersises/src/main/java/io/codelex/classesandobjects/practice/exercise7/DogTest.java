package io.codelex.classesandobjects.practice.exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male");
        Dog dog2 = new Dog("Rocky", "male");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female");

        dog1.setMother(dog6);
        dog1.setFather(dog2);
        dog8.setMother(dog7);
        dog8.setFather(dog4);
        dog2.setMother(dog7);
        dog2.setFather(dog5);
        dog4.setMother(dog6);
        dog4.setFather(dog3);

        System.out.println(dog8.getName() + " father's name is " + dog8.getFathersName());
        System.out.println(dog3.getName() + " father's name is " + dog3.getFathersName());

        System.out.println("Has " + dog8.getName() + " and " + dog2.getName() + " the same mothers? " + dog8.hasSameMotherAs(dog2));
        System.out.println("Has " + dog8.getName() + " and " + "null" + " the same mothers? " + dog8.hasSameMotherAs(null));
        System.out.println("Has " + dog8.getName() + " and " + dog8.getName() + " the same mothers? " + dog8.hasSameMotherAs(dog8));
        System.out.println("Has " + dog8.getName() + " and " + dog1.getName() + " the same mothers? " + dog8.hasSameMotherAs(dog3));
    }
}
