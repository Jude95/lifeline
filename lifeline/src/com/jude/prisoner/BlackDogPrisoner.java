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
        return "��Ĭ��2015211793";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        if (index == 0) {
            //���������r(�s_�t)�q
            int x = 1 + (int) (Math.random() * totalCount);
            return x;
        }
        if(index == 1){
            //ʵ���������ȽϺ���(�s-�t)
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
