package com.jude.manager;

import com.jude.Decider;

import java.util.*;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class Manager {
    private List<Decider> mDeciders;
    private HashMap<Decider,Integer> mScore;
    private HashMap<Decider,Integer> mTempHold;

    public Manager(Decider[] mDeciders) {
        this.mDeciders = Arrays.asList(mDeciders);
        this.mScore = new HashMap<Decider, Integer>();
        for (Decider mDecider : mDeciders) {
            mScore.put(mDecider,0);
        }
    }

    public void start(int count){
        for (int round = count; round > 0; round--) {
            int total = 100;
            init();
            for (int order = 0; order < mDeciders.size(); order++) {
                int curTake = take(order,total);
                total-=curTake;
            }
            recorder();
        }
    }

    private void init(){
        Collections.shuffle(mDeciders);
        mTempHold = new HashMap<Decider, Integer>();
        for (Decider mDecider : mDeciders) {
            mTempHold.put(mDecider,0);
        }
    }

    private int take(int index,int last){
        int count = mDeciders.get(index).take(index,last);
        mTempHold.replace(mDeciders.get(index),count);
        return count;
    }

    public HashMap<Decider,Integer> getScore(){
        return mScore;
    }

    private void recorder(){
        ArrayList<Map.Entry<Decider,Integer>> arrayList = new ArrayList<Map.Entry<Decider, Integer>>(mTempHold.entrySet());
        final boolean[] hasEqual = {false};
        arrayList.sort(new Comparator<Map.Entry<Decider, Integer>>() {
            @Override
            public int compare(Map.Entry<Decider, Integer> o1, Map.Entry<Decider, Integer> o2) {
                if (!hasEqual[0]&&o1.getKey()!=o2.getKey()){
                    hasEqual[0] = o2.getValue()==o1.getValue();
                }
                return o2.getValue()-o1.getValue();
            }
        });
        if (hasEqual[0]){
            return;
        }
        for (int i = 1; i < arrayList.size()-1; i++) {
                mScore.replace(arrayList.get(i).getKey(),mScore.get(arrayList.get(i).getKey())+1);
        }
    }

}
