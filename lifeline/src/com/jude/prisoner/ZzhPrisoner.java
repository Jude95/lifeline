package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;


/**
 * Created by z.z.hang on 2015/11/6.
 */
public class ZzhPrisoner implements Prisoner{
    private int totalPerson;
    private int totalCount;

    @Override
    public String getName(){
        return"张正杭2015214284";
    }

    @Override
    public void begin(Manager manager,int totalPerson,int totalCount){
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

    @Override
    public int take(int index,int last){
        return((totalCount-last)/(index+1) + totalCount/totalPerson);
    }

    @Override
    public void result(boolean survived){

    }
}
