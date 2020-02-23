package model;

import java.util.Date;

public class Student {
    private String name;
    private Date birth;
    private Double grade1, grade2;

    public Student() {
    }

    public Student(String name, Date birth, Double grade1, Double grade2) {
        this.name = name;
        this.birth = birth;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getGrade1() {
        return grade1;
    }

    public void setGrade1(Double grade1) {
        this.grade1 = grade1;
    }

    public Double getGrade2() {
        return grade2;
    }

    public void setGrade2(Double grade2) {
        this.grade2 = grade2;
    }
}