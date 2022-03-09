package com.franc.design.creational.prototype.after;

import java.util.Objects;

public class Student implements Cloneable{

    private int student_grade;
    private int student_class;
    private int student_number;
    private String student_name;

    private Teacher teacher;


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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    // 복제 메소드
    @Override
    protected Object clone() {
        //return super.clone(); ==> 얕은 복사

        // 깊은 복사
        Teacher new_teacher = new Teacher();
        new_teacher.setTeacher_code(teacher.getTeacher_code());
        new_teacher.setTeacher_name(teacher.getTeacher_name());

        Student new_student = new Student();
        new_student.setStudent_grade(student_grade);
        new_student.setStudent_class(student_class);
        new_student.setStudent_number(student_number);
        new_student.setStudent_name(student_name);
        new_student.setTeacher(new_teacher);

        return new_student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student_grade == student.student_grade && student_class == student.student_class && student_number == student.student_number && Objects.equals(student_name, student.student_name) && Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_grade, student_class, student_number, student_name, teacher);
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_grade=" + student_grade +
                ", student_class=" + student_class +
                ", student_number=" + student_number +
                ", student_name='" + student_name + '\'' +
                ", teacher=" + teacher.toString() +
                '}';
    }
}
