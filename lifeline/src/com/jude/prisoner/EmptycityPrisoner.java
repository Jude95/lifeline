package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by asus1 on 2015/11/1.
 */
public class EmptycityPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "朱鸿达2015211589";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        //无谓对错，无畏生死。
        return ((totalCount + (last - 1)) / (totalPerson + (index + 1)) / 2);
    }

    @Override
    public void result(boolean survived) {

    }


}
