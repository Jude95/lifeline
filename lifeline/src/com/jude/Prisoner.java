package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class RedundantPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "吴立嵩2025210855";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
         return (totalCount-last)/(index+2);
    }

    @Override
    public void result(boolean survived) {

    }

}
