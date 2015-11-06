package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

import java.util.Random;

/**
 * Created by a on 2015/11/6.
 */
public class HugewavePrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "胡峻玮2014210513";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return (int)(totalCount * 0.98/ totalPerson);//乱取的
    }

    @Override
    public void result(boolean survived) {

    }
}
