package io.codelex.oop.computers;

public class ComputerApp {
    public static void main(String[] args) {
        Computer pc1 = new Computer("Intel i5-6600", 8192, "Radeon RX 480", "Asus", "1");
        Computer pc3 = new Computer("Intel i5-6600", 8192, "Radeon RX 480", "Asus", "2");
        Computer pc2 = new Computer("Intel", 8192, "Intel", "Apple", "Air");
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
        System.out.println("PC are equal:" + pc1.equals(pc3));

        Laptop laptop1 = new Laptop("Intel i5-6600", 8192, "Radeon RX 480", "Asus", "2", 100);
        Laptop laptop2 = new Laptop("Intel i5-6600", 8192, "Radeon RX 480", "Asus", "1", 100);
        Laptop laptop3 = new Laptop("Intel", 8192, "Intel", "Apple", "Air",100);
        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
        System.out.println("Laptops are equal:" + laptop1.equals(laptop3));

    }
}
