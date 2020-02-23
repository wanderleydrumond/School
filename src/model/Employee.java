package model;

public class Employee extends Person{
    private Double salary;

    public Employee() {
        super();
    }

    public Employee(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, String email, Double salary) {
        super(name, email);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("------------------\nEMPLOYEE DATA:" + "\nSalary: " + getSalary() );
    }
}