package com.conatuseus.lotto;

import java.io.IOException;

public class LottoGame {
    private User user;

    public LottoGame(){
        this.user=new User();
    }

    public void run() throws IOException {
        System.out.println(">> Lotto 게임을 시작합니다.");
        user.inputMoney();
        user.makeLottoList();

        for(Lotto lotto:user.getLottoList()){
            System.out.println(lotto.toString());
        }

        System.out.println("<< Lotto 게임을 종료합니다.");
    }

}
