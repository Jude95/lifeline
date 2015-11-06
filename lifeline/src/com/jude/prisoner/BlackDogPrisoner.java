package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by asus on 2015/11/5.
 */
public class BlackDogPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "刘默晓2015211793";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        if (index == 0) {
            //生死有命╮(╯_╰)╭
            int x = 1 + (int) (Math.random() * totalCount);
            return x;
        }
        if(index == 1){
            //实验表明这个比较靠谱（真的是实验(＃－－)/ .）
            return totalPerson*166;
        }
        else
        {
            int x = (totalCount-last)/(index-1)+17;
            return x;

        }}
    @Override
    public void result(boolean survived) {

    }
}
