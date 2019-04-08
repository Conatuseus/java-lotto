package com.conatuseus.lotto;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString(){
        StringBuilder ret= new StringBuilder();
        for( int n:this.numbers){
            ret.append(n);
        }
        return ret.toString();
    }

}
