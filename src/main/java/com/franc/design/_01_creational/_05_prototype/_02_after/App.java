package com.franc.design._01_creational._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        // #1. 학생1 객체 생성
        Teacher t = new Teacher();
        t.setTeacher_code("0001");
        t.setTeacher_name("김담임");

        Student s1 = new Student();
        s1.setStudent_grade(1);
        s1.setStudent_class(3);
        s1.setStudent_number(1);
        s1.setStudent_name("1번학생");
        s1.setTeacher(t);

        // #2. 학생1의 객체를 프로토타입으로 사용해 학생2 객체 생성
        Student s2 = (Student) s1.clone();

        s2.setStudent_number(2);
        s2.setStudent_name("2번학생");


        // #3-1. 학생1과 학생2는 같은 객체인가?? (참조하는 주소가 같은가?) ==> false
        System.out.println(s1 == s2);

        // #3-2. 학생1과 학생2의 데이터가 같은가?? ==> true
        System.out.println(s1.equals(s2));

        // #3-3_1. 학생1의 선생과 학생2의 선생은 같은 객체인가? ==> true
        System.out.println(s1.getTeacher() == s2.getTeacher());

        // #3-3_2. 학생1과 학생2는 같은 선생 객체의 주소를 참조한다.
        t.setTeacher_name("박담임");
        System.out.println(s1.getTeacher().getTeacher_name());  // 박담임으로 변경
        System.out.println(s2.getTeacher().getTeacher_name());  // 박담임으로 변경

        s2.setStudent_number(2);
        s2.setStudent_name("2번학생");
        System.out.println(s1.toString());
        System.out.println(s2.toString());


        /* 깊은 복사로 바꾼 후... */
        // #3-1. 학생1과 학생2는 같은 객체인가?? (참조하는 주소가 같은가?) ==> false
        System.out.println(s1 == s2);

        // #3-2. 학생1과 학생2의 데이터가 같은가?? ==> false
        System.out.println(s1.equals(s2));

        // #3-3_1. 학생1의 선생과 학생2의 선생은 같은 객체인가? ==> false
        System.out.println(s1.getTeacher() == s2.getTeacher());

        // #3-3_2. 학생1과 학생2는 다른 선생 레퍼런스를 참조한다.
        t.setTeacher_name("박담임");
        System.out.println(s1.getTeacher().getTeacher_name());  // 박담임으로 변경
        System.out.println(s2.getTeacher().getTeacher_name());  // 변경X





    }
}
