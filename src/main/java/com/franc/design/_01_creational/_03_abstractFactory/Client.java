package com.franc.design._01_creational._03_abstractFactory;

import com.franc.design._01_creational._03_abstractFactory._02_after.AvanteCarFactory;
import com.franc.design._01_creational._03_abstractFactory._02_after.AvantePartsFactory;
import com.franc.design._01_creational._03_abstractFactory._02_after.AvanteSportsPartsFactory;
import com.franc.design._01_creational._03_abstractFactory._01_before.AvanteCarFactory_bf;

import javax.xml.parsers.DocumentBuilderFactory;

public class Client {

    public static void main(String[] args) {

        // bf
        HyundaiCar avante = new AvanteCarFactory_bf().createCar();
        System.out.println(avante.getEngine().getClass());
        System.out.println(avante.getPlatform().getClass());
        System.out.println();

        // af
        AvanteCarFactory avanteCarFactory = new AvanteCarFactory(new AvantePartsFactory());
        HyundaiCar avante2 = avanteCarFactory.createCar();
        System.out.println(avante2.getEngine().getClass());
        System.out.println(avante2.getPlatform().getClass());
        System.out.println();


        HyundaiCar avanteSports
                = new AvanteCarFactory(new AvanteSportsPartsFactory())
                    .createCar(); // 아반떼 공장에 '아반떼 스포츠' 생산 주문

        System.out.println(avanteSports.getEngine().getClass()); // AvanteSportsEngine
        System.out.println(avanteSports.getPlatform().getClass()); // AvanteSportsPlatform

        DocumentBuilderFactory.newInstance();
    }
}
