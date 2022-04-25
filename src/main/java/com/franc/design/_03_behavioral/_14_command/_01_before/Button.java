package com.franc.design._03_behavioral._14_command._01_before;

/** [클라이언트] - '조명'을 버튼을 통해 조작. */
public class Button {
    private Light light; // 버튼을 게임을 조작하는 용도로 사용하려면?? => 클라이언트 코드를 변경해야 한다....

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();


    }
}
