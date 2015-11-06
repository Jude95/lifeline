package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by TR on 2015/11/6.
 */
public class NimaPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;


    @Override
    public String getName() {
        return "王子君2015214115";
    }



    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }



    @Override
    public int take(int index, int last) {
        return ((totalCount-last)/(index+1) + 1)/2 + 1;
    }



    @Override
    public void result(boolean survived) {
    }
}
