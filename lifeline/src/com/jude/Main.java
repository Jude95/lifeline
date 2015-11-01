package com.jude;

import com.jude.prisoner.DongguaPrisoner;
import com.jude.prisoner.NimaPrisoner;
import com.jude.prisoner.SimonlaPrisoner;

import java.util.Map;

public class Main {
    public static final Prisoner[] PRISONERS = {
            new SimonlaPrisoner(),
            new NimaPrisoner(),
            new DongguaPrisoner(),
    };


    public static void main(String[] args) {
        //new 一个审判者，把囚徒们和1000颗豆子给他
        Manager manager = new Manager(PRISONERS,5000);
        //审判1W次
        manager.start(3000);
        for (Map.Entry<Prisoner, Integer> deciderIntegerEntry : manager.getScore().entrySet()) {
            System.out.println(deciderIntegerEntry.getKey().getName()+":"+deciderIntegerEntry.getValue());
        }
    }

}
