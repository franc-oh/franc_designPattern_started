package com.franc.design._02_structural._07_bridge.abstraction;

import com.franc.design._02_structural._07_bridge.Implementation.MediaPlayer;

public class Sonata extends HyundaiCar {

    public Sonata(MediaPlayer player) {
        super(player, "Sonata");
    }
}
