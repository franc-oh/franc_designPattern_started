package com.franc.design._03_behavioral._14_command._02_after;

/** ConcreteCommand (게임을 시작)
 * - 누구에게 요청할건지? 어떻게 사용할건지?에 대한 구체적인 코드
 **/
public class GameStartCommand implements Command {
    private Game game; // #1. 어떤 수신자를 호출하는지?

    public GameStartCommand() {
        if(game == null)
            game = new Game();
    }


    @Override
    public void execute() {
        game.start(); // #2. 수신자를 어떻게 사용할 건지??
    }
}
