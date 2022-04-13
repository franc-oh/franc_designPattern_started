package com.franc.design._01_creational._02_factoryMethod;

import com.franc.design._01_creational._02_factoryMethod._02_after.AvanteCarFactory;
import com.franc.design._01_creational._02_factoryMethod._02_after.GrandeurCarFactory;
import com.franc.design._01_creational._02_factoryMethod._02_after.HyundaiCar;
import com.franc.design._01_creational._02_factoryMethod._02_after.SonataCarFactory;
import com.franc.design._01_creational._02_factoryMethod._01_before.HyundaiCarFactory_Bf;
import com.franc.design._01_creational._02_factoryMethod._01_before.HyundaiCar_Bf;

import java.util.Calendar;
import java.util.Locale;

public class Client {

    public static void main(String[] args) {
        // 1. 일반
        HyundaiCar_Bf avante = new HyundaiCarFactory_Bf().orderCar("아반떼", "WHITE", "MODERN");
        System.out.println(avante.toString());

        HyundaiCar_Bf sonata = new HyundaiCarFactory_Bf().orderCar("소나타", "GOLD", "NOBLE");
        System.out.println(sonata.toString());

        System.out.println("====================================");

        // 2. 팩토리 메소드
        HyundaiCar avante2 = new AvanteCarFactory().orderCar("WHITE", "MODERN");
        System.out.println(avante2.toString());

        HyundaiCar sonata2 = new SonataCarFactory().orderCar("BLUE", "SMART");
        System.out.println(sonata2.toString());

        HyundaiCar grandeur2 = new GrandeurCarFactory().orderCar("METALIC_SILVER", "NOBLE");
        System.out.println(grandeur2.toString());

        System.out.println("====================================");

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
