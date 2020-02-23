package control;

import model.Client;
import model.Employee;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Joseph");
        client.setEmail("joseph@email.com");
        client.setAddress("White River Avenue");

        Employee employee = new Employee();
        employee.setName("Leonard");
        employee.setEmail("leonard@email.com");
        employee.setSalary(1800.);

        employee.print();
        client.print();
    }
}