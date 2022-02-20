package com.franc.design.creational.factoryMethod;

import com.franc.design.creational.factoryMethod.factoryMethod.AvanteCarFactory;
import com.franc.design.creational.factoryMethod.factoryMethod.HyundaiCar;
import com.franc.design.creational.factoryMethod.factoryMethod.SonataCarFactory;
import com.franc.design.creational.factoryMethod.notFactoryMethod.Bf_HyundaiCar;
import com.franc.design.creational.factoryMethod.notFactoryMethod.Bf_HyundaiCarFactory;

import java.util.Calendar;
import java.util.Locale;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        /* 팩토리메소드 적용 X */
        Bf_HyundaiCar myCar1 = Bf_HyundaiCarFactory.orderCar("아반떼", "WHITE", "MODERN");
        System.out.println(myCar1.toString());
        System.out.println();

        Bf_HyundaiCar myCar2 = Bf_HyundaiCarFactory.orderCar("그랜저", "SILVER", "NOBLE");
        System.out.println(myCar2.toString());
        System.out.println();

        /* 팩토리메소드 적용 O */
        HyundaiCar myCar3 = new AvanteCarFactory().orderCar("BLACK", "SMART");
        System.out.println(myCar3.toString());
        System.out.println();

        HyundaiCar myCar4 = new SonataCarFactory().orderCar("SILVER", "NOBLE");
        System.out.println(myCar4.toString());
        System.out.println();



        /*
            팩토리 메소드 패턴의 사용 예 - Java.Lang.Calendar
                - 추상클래스 Calendar
                - 각 파라미터에 맞는 하위클래스로 인스턴스가 만들어진다.
                - NumberFormat도 비슷한 예
        */

        //class java.util.GregorianCalendar
        System.out.println(Calendar.getInstance().getClass());

        //class sun.util.BuddhistCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());

        //class java.util.JapaneseImperialCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());

    }
}
