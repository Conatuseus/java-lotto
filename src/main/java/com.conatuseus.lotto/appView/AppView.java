package com.conatuseus.lotto.appView;

import com.conatuseus.lotto.model.Lotto;
import com.conatuseus.lotto.model.MakeRandom;
import com.conatuseus.lotto.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppView {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final String MONEY_REGEX = "[0-9]+";

    /* AppView 클래스 기본생성자*/
    public AppView() {
    }

    /* 매개변수 String을 print하는 메소드. 줄바꿈을 포함 */
    public static void outputLine(String aString) {
        System.out.println(aString);
    }

    /* 매개변수 String을 print하는 메소드. 줄바꿈 하지 않음 */
    public static void output(String aString) {
        System.out.print(aString);
    }

    public static int inputMoney() throws IOException {
        String input;
        do {
            System.out.println("구입금액을 입력해 주세요.(0이상 1000원 단위)");
            input = br.readLine();
        } while (!isMoneyValid(input));

        return Integer.parseInt(input);
    }

    private static boolean isMoneyValid(String input) {
        if (!input.matches(MONEY_REGEX)) {
            return false;
        }
        int tInputMoney = Integer.parseInt(input);
        return (tInputMoney % 1000) == 0;
    }

//    public static void makeLottoList() {
//        for (int i = 0; i < User.getNumberOfLotto(); i++) {
//            this.getLottoList().add(new Lotto(MakeRandom.makeRandomNumberList()));
//        }
//    }
}
