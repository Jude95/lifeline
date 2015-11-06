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
            return totalCount;//就这样吧
        else if (index==1)
            return ((totalCount-last)/(index+1) + totalCount/totalPerson)/2;//王尼玛算法
        else
            return (totalCount-last)/index+1;//比前面的平均数多拿一个好了
    }

    @Override
    public void result(boolean survived) {
    }
}
