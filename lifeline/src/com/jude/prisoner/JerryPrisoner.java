package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by jerryz on 2015/11/6.
 */
public class JerryPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;


    @Override
    public String getName() {
        return "张文梁2015210215";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        if(index==0){
            return totalCount-999;

        }
        else if(1<=index&&index<=999){
            return totalCount+last;
        }
        else
            return last;


    }

    @Override
    public void result(boolean survived) {


    }
}