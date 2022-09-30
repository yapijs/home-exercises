package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonsApp {
    public static void main(String[] args) {
        Customer customer = new Customer("George", "Bush", "20101-12914", 91, "CID1234", 0);
        customer.setPurchaseCount(52);
        System.out.println(customer.getInfo());

        Employee employee = new Employee("Donald","Duck", "123452", 95, "Duck", LocalDate.of(1934, 3, 1));
        System.out.println(employee.getInfo());
    }
}
