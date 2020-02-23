package model;

public class Seller {
    private String name, cpf;
    private Double sellValue;

    public Seller() {
    }

    public Seller(String name, String cpf, Double sellValue) {
        this.name = name;
        this.cpf = cpf;
        this.sellValue = sellValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSellValue() {
        return sellValue;
    }

    public void setSellValue(Double sellValue) {
        this.sellValue = sellValue;
    }

    private Double calExtra() {
        return getSellValue() * .07;
    }

    public Double calExtra(Boolean goal) {
        if (goal == true) {
            return getSellValue() * .11;
        } else {
            return this.calExtra();
        }
    }

    public Double calExtra(Boolean goal, Double bonus) {
        if (goal == true) {
            return getSellValue() * .1 + bonus;
        } else {
            return this.calExtra() + bonus;
        }
    }
}