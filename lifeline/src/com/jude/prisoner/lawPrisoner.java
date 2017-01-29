//just test
package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;



public class lawPrisoner implements Prisoner{
    private int totalPerson;
    private int totalCount;

    @Override
    public String getName(){
        return"张华为2015214735";
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
