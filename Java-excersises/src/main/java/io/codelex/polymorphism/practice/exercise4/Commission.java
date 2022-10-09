package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales = 0;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double totalCommissions = totalSales * commissionRate;
        totalSales = 0;
        return super.pay() + totalCommissions;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
