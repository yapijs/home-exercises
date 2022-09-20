package io.codelex.classesandobjects.practice.exercise1;

public class Main {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product someDevice = new Product("Epson EB-U05", 46.46, 1);
        mouse.printProduct();
        phone.printProduct();
        someDevice.printProduct();

        mouse.setAmount(20);
        mouse.setPrice(65.00);

        phone.setAmount(5);
        phone.setPrice(1099.99);

        someDevice.setAmount(2);
        someDevice.setPrice(38);

        System.out.println("\n");
        mouse.printProduct();
        phone.printProduct();
        someDevice.printProduct();
    }

}
