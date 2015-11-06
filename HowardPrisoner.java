package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by vqqs on 2015/11/6.
 */
public class AcePrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "罗皓楠 2015214126";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

  @Override
    public int take(int index, int last) {
        if(index==0)
        {
           return totalCount-totalPerson;
        }
        else if(index==1)
            return (totalCount-last+1);     else
            return (totalCount -last)/index;
     }

        @Override
        public void result(boolean survived) {
        }
}
