package io.codelex.polymorphism.practice.exercise3;

public class TestPersons {
    public static void main(String[] args) {

        Person student1 = new Student("John", "Brown", "Oxford street 1", 101, 4.8);
        Person employee1 = new Employee("Peter", "Brown", "Wallstreet 100", 102, "Investor");

        student1.display();
        employee1.display();
    }

}
