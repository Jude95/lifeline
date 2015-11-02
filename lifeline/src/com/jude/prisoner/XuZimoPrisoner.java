package com.jude.prisoner;


import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by 子墨 on 2015/10/31.
 */
public class XuZimoPrisoner implements Prisoner {
    private int totalPerson;
    private int totalCount;

    @Override
    public String getName() {
        return "许建军2014213087";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

    @Override
    public int take(int index, int last) {
        return (((totalCount-last)/(index+totalPerson)) + totalCount/totalPerson);
    }

    @Override
    public void result(boolean survived) {

    }
}
