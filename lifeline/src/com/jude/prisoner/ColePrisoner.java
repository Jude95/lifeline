package com.jude.prisoner;

import com.jude.Manager;

/**
 * Created by Free on 2015/11/5.
 */
public class ColePrisoner {
    int totalCount;
    int totalPerson;

    public String getName() {return "曹威2015214622";}


    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }


    public int take(int index, int last) {
        return ((totalCount-last)/(index) + totalCount/totalPerson)/2;
    }


    public void result(boolean survived) {

    }
}
