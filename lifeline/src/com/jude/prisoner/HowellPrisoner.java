package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Howell on 2015/11/3.
 */
public class HowellPrisoner implements Prisoner {
    int totalPerson;
    int totalCount;
    @Override
    public String getName() {
        return "卫潜昊2015210622";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

    @Override
    public int take(int index, int last) {
        if(index <1  ){
            return((totalCount-last)/(index+1)+last/(totalPerson-index-1));
        }
        else {
            return ((totalCount - last)/index + (last-(totalCount/totalPerson))/index/9);
        }
    }

    @Override
    public void result(boolean survived) {

    }
}
