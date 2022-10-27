package io.codelex.oop.parcels;

public class ValidateParcelsApp {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10,10,15,17, true);
        System.out.println("Package valid: " + parcel1.validate());


        Parcel parcel2 = new Parcel(10,10,8,20, false);
        System.out.println("Package valid: " + parcel2.validate());


        Parcel parcel3 = new Parcel(10,1000,8,20, false);
        System.out.println("Package valid: " + parcel3.validate());
    }
}
