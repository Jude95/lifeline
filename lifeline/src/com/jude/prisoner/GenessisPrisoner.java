package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by Yvjing on 2015/11/5.
 */
public class GenessisPrisoner implements Prisoner{
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "郭昱璟2015211796";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return -3+(int)(Math.random()*(totalCount/totalPerson+3));
    }
    //这一切，都是命运石之门的选择= =+
    @Override
    public void result(boolean survived) {

    }
}