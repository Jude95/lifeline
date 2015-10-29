package com.jude.deciders;

import com.jude.Decider;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class RandomDecider implements Decider{
    private String name;

    public RandomDecider(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "随机帝:"+name;
    }

    @Override
    public int take(int index, int last) {
        return (int) (Math.random()*last);
    }

}
