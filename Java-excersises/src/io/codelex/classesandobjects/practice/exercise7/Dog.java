package io.codelex.classesandobjects.practice.exercise7;

import java.util.Objects;

public class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, Dog mother, Dog father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getMother() {
        return mother;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public Dog getFather() {
        return father;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public String getFathersName() {
        if (father == null) {
            return "unknown";
        } else {
           return this.father.getName();
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this == otherDog) {
            return true;
        }
        if (otherDog == null || otherDog.mother == null) {
            return false;
        }
        return mother.getName().equals(otherDog.mother.getName());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(sex, dog.sex) && Objects.equals(mother, dog.mother) && Objects.equals(father, dog.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, mother, father);
    }
}
