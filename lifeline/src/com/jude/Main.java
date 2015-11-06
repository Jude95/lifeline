package com.jude;

import com.jude.prisoner.*;

import java.util.*;

public class Main {
    public static final Prisoner[] PRISONERS = {
            new AcePrisoner(),
            new AchaoPrisoner(),
            new BlackDogPrisoner(),
            new chenChanghongPrisoner(),
            new ChenjiPaynePrisoner(),
            new collectPrisoner(),
            new CquptZouShengPrisoner(),
            new CzgPrisoner(),
            new DongguaPrisoner(),
            new EmptycityPrisoner(),
            new FortuneDreamPrisoner(),
            new GaijinPrisoner(),
            new GenessisPrisoner(),
            new HanLiangPrisoner(),
            new HowellPrisoner(),
            new HugewavePrisoner(),
            new HunterlyPrisoner(),
            //new IcymoonPrisoner(),
            new IngramyangPrisoner(),
            new JianJunPrisoner(),
            new JiecaoPrisoner(),
            new LslsPrisoner(),
            new lstPrisoner(),
            new LuckPrisoner(),
            new MeimeiPrisoner(),
            new NimaPrisoner(),
            new NutCcPrisoner(),
            new RedundantPrisoner(),
            new RobinPrisoner(),
            new SimonlaPrisoner(),
            new XiaoChen(),
            new XuZimoPrisoner(),
            new ZhangDeShengPrisoner(),
            new ZdjPrisoner(),
            new ZzhPrisoner(),
    };


    public static void main(String[] args) {
        //new 一个审判者，把囚徒们和1000颗豆子给他
        Manager manager = new Manager(PRISONERS,10000);
        //审判1W次
        manager.start(1000000);
        ArrayList<Map.Entry<Prisoner, Integer>> result = new ArrayList<>(manager.getScore().entrySet());
        Collections.sort(result, new Comparator<Map.Entry<Prisoner, Integer>>() {
            @Override
            public int compare(Map.Entry<Prisoner, Integer> o1, Map.Entry<Prisoner, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        for (Map.Entry<Prisoner, Integer> deciderIntegerEntry : result) {
            System.out.println(deciderIntegerEntry.getKey().getName()+":"+deciderIntegerEntry.getValue());
        }
    }

}
