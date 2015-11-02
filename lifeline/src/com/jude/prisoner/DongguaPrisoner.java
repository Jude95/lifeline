package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by Administrator on 2015/10/31.
 */
public class DongguaPrisoner implements Prisoner {

    int totalPerson;
    int totalCount;

    @Override
    public String getName() {
        return "饶东2015211478";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

    @Override
    public int take(int index, int last) {
        if(index < 2 ){
            return ((totalCount-last)/(index+1) + totalCount/totalPerson)/2 + 2*totalPerson;//第一个实在是想不到什么好的方法了，还是用朱大大的吧、、、、虽然改了一下，但是借(抄)鉴(袭)请见谅、、、
        }
        else {
            return (totalCount - last)/index + (totalCount/totalPerson - (totalCount - last)/index)/index;
        }
    }

    @Override
    public void result(boolean survived) {

    }
}
