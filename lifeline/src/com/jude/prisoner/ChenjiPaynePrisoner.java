package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class ChenjiPaynePrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "陈继平2015214128";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
           return totalCount-totalPerson;//all die
        }
        
        @Override
        public void result(boolean survived) {
        }
}
