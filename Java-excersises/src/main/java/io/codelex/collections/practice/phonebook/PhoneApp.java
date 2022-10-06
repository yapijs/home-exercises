package io.codelex.collections.practice.phonebook;

public class PhoneApp {
    public static void main(String[] args) {
        PhoneDirectory phone = new PhoneDirectory();
        phone.putNumber("Dāvis", "12345");
        phone.putNumber("Pēteris", "54321");
        phone.putNumber("Juris", "567889");


        System.out.println(phone.getNumber("Dāvis"));
        System.out.println(phone.getNumber("Pēteris"));
        System.out.println(phone.getNumber("Juris"));
        phone.putNumber("Pēteris", "54322");
        System.out.println(phone.getNumber("Pēteris"));


    }
}
