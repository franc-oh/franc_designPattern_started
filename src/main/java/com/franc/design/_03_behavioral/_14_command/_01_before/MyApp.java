package com.franc.design._03_behavioral._14_command._01_before;

/** [클라이언트] - '게임'을 앱을 통해 동작. */
public class MyApp {
    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
