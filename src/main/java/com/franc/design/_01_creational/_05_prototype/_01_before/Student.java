package com.franc.design._01_creational._05_prototype._01_before;

import java.util.Objects;

public class Student {

    private int student_grade;
    private int student_class;
    private int student_number;
    private String student_name;

    public int getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(int student_grade) {
        this.student_grade = student_grade;
    }

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public int getStudent_number() {
        return student_number;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "student_grade=" + student_grade +
                ", student_class=" + student_class +
                ", student_number=" + student_number +
                ", student_name='" + student_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student_grade == student.student_grade && student_class == student.student_class && student_number == student.student_number && Objects.equals(student_name, student.student_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_grade, student_class, student_number, student_name);
    }
}
