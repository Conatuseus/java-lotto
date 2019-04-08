package com.conatuseus.lotto;

import java.io.IOException;

public class LottoGame {
    private User user=new User();

    public LottoGame(){

    }

    public void run() throws IOException {
        System.out.println(">> Lotto 게임을 시작합니다.");
        user.inputMoney();

        System.out.println("<< Lotto 게임을 종료합니다.");
    }
}
