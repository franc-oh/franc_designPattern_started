package com.franc.design._02_structural._07_bridge.client;

import com.franc.design._02_structural._07_bridge.Implementation.Music;
import com.franc.design._02_structural._07_bridge.Implementation.Navigation;
import com.franc.design._02_structural._07_bridge.Implementation.Radio;
import com.franc.design._02_structural._07_bridge.abstraction.Avante;
import com.franc.design._02_structural._07_bridge.abstraction.Car;
import com.franc.design._02_structural._07_bridge.abstraction.Sonata;

public class App {
    public static void main(String[] args) {
        // #1. Abstraction:아반떼, Implementation:뮤직
        Car avante = new Avante(new Music());
        avante.powerOn();
        avante.mediaOn();
        avante.mediaOff();

        // #2. Abstraction:소나타, Implementation:라디오
        Car sonata = new Sonata(new Radio());
        sonata.powerOn();
        sonata.mediaOn();
        sonata.mediaOff();
    }
}
