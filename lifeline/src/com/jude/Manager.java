package com.jude;

import com.jude.Prisoner;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class Manager {
    private List<Prisoner> mPrisoners;
    private int mBeanCount;
    private HashMap<Prisoner,Integer> mScore;
    private HashMap<Prisoner,Integer> mTempHold;

     Manager(Prisoner[] mPrisoners,int beanCount ) {
        this.mPrisoners = Arrays.asList(mPrisoners);
        this.mBeanCount = beanCount;
        this.mScore = new HashMap<Prisoner, Integer>();
        for (Prisoner mPrisoner : mPrisoners) {
            mScore.put(mPrisoner,0);
        }
    }

     void start(int roundCount){
        //初始化各个囚徒
        for (Prisoner mPrisoner : mPrisoners) {
            try {
                mPrisoner.begin(this,mPrisoners.size(), mBeanCount);
            }catch (Exception e){
                //总有刁民想害朕
            }
        }
        //无尽的轮回
        for (int round = 0; round < roundCount; round++) {
            int total = mBeanCount;
            init();
            //System.out.println("第" + round + "局开始");
            for (int order = 0; order < mPrisoners.size(); order++) {
                int curTake = take(order,total);
                total-=curTake;
            }
            recorder();
        }
    }

    private void init(){
        //乱序囚徒
        Collections.shuffle(mPrisoners);
        //初始化每个囚徒与豆子数量
        mTempHold = new HashMap<Prisoner, Integer>();
        for (Prisoner mPrisoner : mPrisoners) {
            mTempHold.put(mPrisoner,-1);
        }
    }

    private int take(int index,int last){

        //取豆子
        int count = 0;
        try {
            count = mPrisoners.get(index).take(index,last);
        }catch (Exception e){
            count=-1;
            //这些神经病抓出来单独死
        }
        //如果返回无效个数，和上面的神经病一样死
        if (count>last||count<0)count=-1;

        //System.out.println(mPrisoners.get(index).getName()+"取了"+count+"个");
        //保存每个人取的豆子数
        mTempHold.replace(mPrisoners.get(index),count);
        return count;
    }

    HashMap<Prisoner,Integer> getScore(){
        return mScore;
    }

    private void recorder(){
        ArrayList<Map.Entry<Prisoner,Integer>> arrayList = new ArrayList<Map.Entry<Prisoner, Integer>>(mTempHold.entrySet());


        //踢掉神经病
        for (Map.Entry<Prisoner, Integer> prisonerIntegerEntry : new ArrayList<Map.Entry<Prisoner, Integer>>(arrayList)) {
            if (prisonerIntegerEntry.getValue()==-1)arrayList.remove(prisonerIntegerEntry);
        }


        //是否重复的flag
        final boolean[] hasEqual = {false};
        //按豆子数排序，顺便检查重复
        arrayList.sort(new Comparator<Map.Entry<Prisoner, Integer>>() {
            @Override
            public int compare(Map.Entry<Prisoner, Integer> o1, Map.Entry<Prisoner, Integer> o2) {
                if (!hasEqual[0]&&o1.getKey()!=o2.getKey()){
                    hasEqual[0] = o2.getValue().equals(o1.getValue());
                }
                return o2.getValue()-o1.getValue();
            }
        });
        //如果有重复，全部死
        if (hasEqual[0]){
            //System.out.println("全都得死");
            for (Map.Entry<Prisoner, Integer> prisonerIntegerEntry : arrayList) {
                prisonerIntegerEntry.getKey().result(false);
            }
            return;
        }
        //给除了第一和最后一名的人，存活数加1
        for (int i = 1; i < arrayList.size()-1; i++) {
            arrayList.get(i).getKey().result(true);
            mScore.replace(arrayList.get(i).getKey(),mScore.get(arrayList.get(i).getKey())+1);
        }
        try {

            arrayList.get(0).getKey().result(false);
            //System.out.println(arrayList.get(0).getKey().getName()+"拿了最多:"+arrayList.get(0).getValue()+"个");
            arrayList.get(arrayList.size()-1).getKey().result(false);
            //System.out.println(arrayList.get(arrayList.size()-1).getKey().getName()+"拿了最少:"+arrayList.get(arrayList.size()-1).getValue()+"个");

        }catch (Exception e){
            //总有刁民想害朕
        }
    }

}
