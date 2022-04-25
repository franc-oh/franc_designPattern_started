package com.franc.design._03_behavioral._14_command._02_after;

/** ConcreteCommand (불을 끈다.)
 * - 누구에게 요청할건지? 어떻게 사용할건지?에 대한 구체적인 코드
 **/
public class LightOffCommand implements Command {
    private Light light; // #1. 어떤 수신자를 호출하는지?

    public LightOffCommand() {
        if(light == null)
            light = new Light();
    }


    @Override
    public void execute() {
        light.off(); // #2. 수신자를 어떻게 사용할 건지??
    }
}
