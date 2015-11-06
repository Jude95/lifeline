package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class FortunePrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "����2014214019";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return  ((totalCount-last)/(index+1) + totalCount/totalPerson)/7��//Ϊʲô��7����Ϊ��ϲ������
    }

    @Override
    public void result(boolean survived) {

    }

}