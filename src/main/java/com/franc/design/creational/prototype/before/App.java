package com.franc.design.creational.prototype.before;

public class App {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudent_grade(1);
        s1.setStudent_class(3);
        s1.setStudent_number(1);
        s1.setStudent_name("1번학생");

        Student s2 = new Student();
        s2.setStudent_grade(1);
        s2.setStudent_class(3);
        s2.setStudent_number(2);
        s2.setStudent_name("2번학생");
    }
}
