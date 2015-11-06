package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;
/**
 * Created by red on 2015/11/6.
 */
public class RobinPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "叶舟洋2015214742";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    public int take(int index, int last) {
        if(index ==0){
            return totalCount*40/100;
            //让我来做一回好人，把机会留给后面的人:)
        }
        if(index==1){
            return totalCount*18/100;
            //干扰战术
        }
        else {
            return (totalCount -last)/index;
            //跟随战术
        }
    }
    @Override
    public void result(boolean survived) {

    }


}
