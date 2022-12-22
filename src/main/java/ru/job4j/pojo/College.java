package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Белов Александр Николаевич");
        student.setGroup(3);
        student.setDateOfReceipt(LocalDate.of(2020, 10, 10));

        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getDateOfReceipt());
    }
}
