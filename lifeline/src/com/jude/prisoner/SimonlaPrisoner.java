package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;
/**
 * Created by asus on 2015/11/1.
 */
public class SimonlaPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "曾名杨2015213870";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return totalCount*18/100;
    }

    @Override
    public void result(boolean survived) {

    }


}
