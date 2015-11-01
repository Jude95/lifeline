package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by vqqs on 2015/10/31.
 */
public class AcePrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "郑昱旋2015211876";
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
           return totalCount-totalPerson;//所有人一起死好了
        }
        else if(index==1)
            return (totalCount-last+1);//要不我活要不大家一起死
        else
            return (totalCount -last)/index;//不会只是我一个人死
    }

        @Override
        public void result(boolean survived) {
        }
}
