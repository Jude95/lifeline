package com.jude.prisoner;
/*
 * Created by Asus on 2015/11/1.
 */
public class SimonlaPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "周朝星2015210932";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return 1000;//死了算了吧，一了百了。
    }

    @Override
    public void result(boolean survived) {

    }


}
