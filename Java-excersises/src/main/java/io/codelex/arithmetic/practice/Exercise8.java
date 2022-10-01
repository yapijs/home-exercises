package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void main(String[] args) {
        String employee1= "Employee 1";
        double salary1 = 7.5;
        int hoursWorked1 = 35;
        String employee2= "Employee 2";
        double salary2 = 8.2;
        int hoursWorked2 = 47;
        String employee3= "Employee 3";
        double salary3 = 10;
        int hoursWorked3 = 73;

        salaryCalculator(employee1, salary1, hoursWorked1);
        salaryCalculator(employee2, salary2, hoursWorked2);
        salaryCalculator(employee3, salary3, hoursWorked3);
    }

    public static void salaryCalculator(String employeeName, double salaryPerHour, int hoursWorked) {
        final double BASE_SALARY = 8D;
        final int MAX_AMOUNT_HOURS = 60;
        int additionalHours;
        int baseHours;
        double totalSalary = 0;

        if (salaryPerHour < BASE_SALARY) {
            System.out.println("Error! Salary must be at least $" + String.format("%.2f", BASE_SALARY));
            return;
        }

        if (hoursWorked > MAX_AMOUNT_HOURS) {
            System.out.println("Error! It is not allowed to work more than " + MAX_AMOUNT_HOURS + " hours.");
            return;
        }

        if (hoursWorked <= 40) {
            additionalHours = 0;
            baseHours = hoursWorked;
        } else {
            additionalHours = hoursWorked - 40;
            baseHours = 40;
        }

        totalSalary = baseHours * salaryPerHour + additionalHours * salaryPerHour * 1.5;
        System.out.println(employeeName + " has earned a total of " + String.format("%.2f", totalSalary) + "$");
    }
}
