/*
 *  @(#)WinningLotto.java       3.00    2019/04/10
 *
 *  Copyright   (c) 2019 Myungki Sa.
 *  Computer Science Engineering, Java, Daejeon, Korea
 *  All rights reserved.
 *  conatuseus@gmail.com
 */

package com.conatuseus.lotto.model;

import com.conatuseus.lotto.appController.AppController;

import java.util.List;

/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto {
    private final Lotto lotto;
    private final int bonusNo;

    public WinningLotto(Lotto lotto, int bonusNo) {
        this.lotto = lotto;
        this.bonusNo = bonusNo;
    }

    public Rank match(Lotto userLotto) {
        int countOfMatch = 0;
        for (int i = 0; i < AppController.LOTTO_LENGTH; i++) {
            countOfMatch += this.isMatches(userLotto, i);
        }

        return userLotto.isContain(bonusNo) ? Rank.valueOf(countOfMatch, true)
                : Rank.valueOf(countOfMatch, false);
    }

    private int isMatches(Lotto userLotto, int index) {
        return this.lotto.isContain(userLotto.getNumbers().get(index)) ? 1 : 0;
    }

    @Override
    public String toString(){
        List<Integer> ret=this.lotto.getNumbers();
        ret.add(bonusNo);
        return ret.toString();
    }
}
