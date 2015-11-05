package com.jude.prisoner;
import com.jude.Prisoner;
import com.jude.Manager;
/**
 * Created by Zou Sheng on 2015/11/3.
 */
public class CquptZouShengPrisoner implements Prisoner{
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "邹晟2015211529";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    public int take(int index, int last) {
        return ((totalCount-last)/(index+1) + totalCount/totalPerson);
    }
    @Override
    public void result(boolean survived) {

    }




}
