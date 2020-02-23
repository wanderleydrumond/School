package control;

import model.Student;

import javax.swing.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1991, 11 - 1, 20);

        Student student1 = new Student();
        student1.setName("Anthony");
        student1.setGrade1(8.3);
        student1.setGrade2(7.9);
        student1.setBirth(calendar.getTime());
        System.out.println("Name: " + student1.getName() + "\nAverage: " + (student1.getGrade1() + student1.getGrade2())/2 +
                "\nBirthday: " + student1.getBirth());
        JOptionPane.showMessageDialog(null,"Name: " + student1.getName() +
                "\nAverage: " + (student1.getGrade1() + student1.getGrade2())/2 + "\nBirthday: " + student1.getBirth());

        Student student2 = new Student("Harold", calendar.getTime(), 7.3, 8.1);
        System.out.println("Name: " + student2.getName() + "\nAverage: " + (student2.getGrade1() + student2.getGrade2())/2 +
                "\nBirthday: " + student2.getBirth());
        JOptionPane.showMessageDialog(null,"Name: " + student2.getName() +
                "\nAverage: " + (student2.getGrade1() + student2.getGrade2())/2 + "\nBirthday: " + student2.getBirth());
        System.out.println("They are the same?\n" + student2.equals(student2));
        JOptionPane.showMessageDialog(null, "They are the same?\n" + student2.equals(student2));
    }
}