package com.conatuseus.lotto.model;

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
        for(int i=0;i<6;i++){
            countOfMatch+=this.isMatches(userLotto,i);
        }

        return userLotto.isContain(bonusNo) ? Rank.valueOf(countOfMatch, true)
                : Rank.valueOf(countOfMatch, false);
    }

    private int isMatches(Lotto userLotto, int index) {
        return this.lotto.isContain(userLotto.getNumbers().get(index)) ? 1 : 0;
    }


}
