package com.conatuseus.lotto.appController;

import com.conatuseus.lotto.model.User;

import java.io.IOException;

public class AppController {
    private User user;

    public AppController(){
        this.user=new User();
    }

    public void run() throws IOException {
        System.out.println(">> Lotto 게임을 시작합니다.");
        user.inputMoney();
        user.makeLottoList();
        user.printLottoList();

        System.out.println("<< Lotto 게임을 종료합니다.");
    }

}
