package com.jude;

import com.jude.prisoner.*;

import java.util.Map;

public class Main {
    public static final Prisoner[] PRISONERS = {
            new EmptycityPrisoner(),
            new SimonlaPrisoner(),
            new GaijinPrisoner(),
            new AcePrisoner(),
            new XuZimoPrisoner(),
            new DongguaPrisoner(),
            new NimaPrisoner(),
            new BlackDogPrisoner(),
            new CquptZouShengPrisoner(),
            new CzgPrisoner(),
            new IcymoonPrisoner(),
            new ZhangDeShengPrisoner(),
            new JianJunPrisoner(),
            new lstPrisoner()
    };


    public static void main(String[] args) {
        //new 一个审判者，把囚徒们和1000颗豆子给他
        Manager manager = new Manager(PRISONERS,10000);
        //审判1W次
        manager.start(10000);
        for (Map.Entry<Prisoner, Integer> deciderIntegerEntry : manager.getScore().entrySet()) {
            System.out.println(deciderIntegerEntry.getKey().getName()+":"+deciderIntegerEntry.getValue());
        }
    }

}
