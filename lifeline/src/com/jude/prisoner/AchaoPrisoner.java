package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.manager.Manager;

/**
 * Created by admin on 2015/11/5.
 */
public class AchaoPrisoner implements Prisoner
{
    int totalPerson;
    int totalCount;
    public String getName()
    {
        return "ÕÔÒ»·«2015210620";
    }
    public void begin(Manager manager, int totalPerson, int totalCount)
    {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }
    public int take(int index, int last)
    {
        if(index <1  ){
            return((totalCount-last)/(index+1)+last/(totalPerson-index-1));
        }
        else {
            return ((totalCount - last)/index + (last-(totalCount/totalPerson))/index/9);
        }
    }
    public void result(boolean survived) {

    }
}

