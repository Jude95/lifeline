package com.jude.prisoner;
/*
 * Created by Asus on 2015/11/1.
 */
public class SimonlaPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "�ܳ���2015210932";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return 1000;//�������˰ɣ�һ�˰��ˡ�
    }

    @Override
    public void result(boolean survived) {

    }


}
