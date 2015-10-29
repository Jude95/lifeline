package com.jude.deciders;

import com.jude.Decider;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class GreedDecider implements Decider {
    @Override
    public String getName() {
        return "贪婪者";
    }

    @Override
    public int take(int index, int last) {
        return last;
    }
}
