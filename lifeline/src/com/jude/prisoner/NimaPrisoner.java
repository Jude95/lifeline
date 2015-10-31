package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class NimaPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "王尼玛2013211470";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        //经过我王尼玛缜密的计算，我算出我拿这个数最能活
        return ((totalCount-last)/(index+1) + totalCount/totalPerson)/2;
    }

    @Override
    public void result(boolean survived) {

    }

}
