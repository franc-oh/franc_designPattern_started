package com.franc.design._03_behavioral._14_command._02_after;


/** Invoker - 요청자 */
public class Button {

    // 특정 Receiver를 고정하지 않고, Command를 통해 요청을 보낸다.
    public void press(Command command) {
        command.execute();
    }


    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand()); // 게임을 시작
        button.press(new LightOnCommand()); // 조명을 켠다.
        button.press(new LightOffCommand()); // 조명을 끈다.
        button.press(new GameEndCommand()); // 게임을 종료
    }
}
