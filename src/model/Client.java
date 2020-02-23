package model;

public class Client extends Person{
    private String address;

    public Client() {
    }

    public Client(String address) {
        this.address = address;
    }

    public Client(String name, String email, String address) {
        super(name, email);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("----------------------\nCLIENT DATA:" + "\nAddress: " + getAddress());
    }
}