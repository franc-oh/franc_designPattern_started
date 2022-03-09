package com.franc.design.creational.prototype.after;

public class Teacher {
    private String teacher_code;
    private String teacher_name;

    public String getTeacher_code() {
        return teacher_code;
    }

    public void setTeacher_code(String teacher_code) {
        this.teacher_code = teacher_code;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_code='" + teacher_code + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                '}';
    }
}
