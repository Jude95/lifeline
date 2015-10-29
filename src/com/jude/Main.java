package com.jude;

import com.jude.deciders.LessHalfDecider;
import com.jude.deciders.RandomDecider;
import com.jude.deciders.GreedDecider;
import com.jude.manager.Manager;

import java.util.Map;

public class Main {
    public static final Decider[] deciders = {
            new RandomDecider("1"),
            new LessHalfDecider("1"),
            new GreedDecider(),
    };


    public static void main(String[] args) {
        Manager manager = new Manager(deciders);
        manager.start(1000);
        for (Map.Entry<Decider, Integer> deciderIntegerEntry : manager.getScore().entrySet()) {
            System.out.println(deciderIntegerEntry.getKey().getName()+":"+deciderIntegerEntry.getValue());
        }
    }

}
