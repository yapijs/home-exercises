package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person{
    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking.getYear();
    }

    @Override
    public String getInfo() {
        return this.position + " " + super.getFirstName() + " " + super.getLastName() + " (" + getWorkExperience() + " years)";
    }
}
