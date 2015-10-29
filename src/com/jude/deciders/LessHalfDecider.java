package com.jude.deciders;

import com.jude.Decider;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class LessHalfDecider implements Decider {

    private String name;

    public LessHalfDecider(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "杨半仙:"+name;
    }

    @Override
    public int take(int index, int last) {
        return (int) (last/2);
    }


}
