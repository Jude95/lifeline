// * * * * * * * * * * * * * * * * * * * * * * * *
// * REDROCK-TEAM HOMEWORK 5 (20151031)          *
// * Level 4 - LifeLine                          *
// * Author:  Haruue Icymoon                     *
// * Website: http://www.caoyue.com.cn/          *
// * * * * * * * * * * * * * * * * * * * * * * * *

package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class icymoonPrisoner implements Prisoner {
    private int lifeTime, numberToTake, totalPerson, totalCount;
    private boolean isGetManger = true;
    private Manager myManager;
    private List<Prisoner> mPrisoners;
    private Class<?> managerClass;
    private Field mTempHoldField;
    private HashMap<Prisoner, Integer> mTempHold;

    //返回你的名字＋学号
    @Override
    public String getName() {
        return "曹越2015213817";
    }

    //当游戏开始，告诉你囚犯总人数，与豆子总数
    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
        try {
            getManger(manager);
        } catch (Exception e) {
            isGetManger = false;
            System.out.println("getManager失败：" + e);
            return;
        }
    }

    private void getManger(Manager manager) throws NoSuchFieldException, IllegalAccessException {
        //要先和manger搞好关系
        myManager = manager;
        managerClass = manager.getClass();
    }

    //轮到你取豆子
    @Override
    public int take(int index, int last) {
        int bestCount;
        try {
            bestCount = getBestCount(index, last);
        } catch (Exception e) {
            System.out.println("getBestCount失败：" + e);
            return ((totalCount - last) / (index + 1) + totalCount / totalPerson) / 2;
        }
        return (bestCount >= last)?last:bestCount;
    }

    private int getBestCount(int index, int last) throws NoSuchFieldException, IllegalAccessException {
        if (index == 0) {
            //第一个取豆子就只能当王尼玛了
            return ((totalCount - last) / (index + 1) + totalCount / totalPerson) / 2;
        }
        //从manager那里打听已经取豆子的情况
        mTempHoldField = managerClass.getDeclaredField("mTempHold");
        mTempHoldField.setAccessible(true);
        mTempHold = (HashMap<Prisoner, Integer>) (mTempHoldField.get(myManager));
        Integer[] mTempHoldArray = mTempHold.values().toArray(new Integer[0]);
        Arrays.sort(mTempHoldArray);
        System.out.println(Arrays.toString(mTempHoldArray));
        if (index == 1) {
            int theOne = mTempHoldArray[mTempHoldArray.length-1];
            return theOne+(int)Math.pow(-1,(totalCount / totalPerson) - theOne);
        }
        return getMiddle(mTempHoldArray);
    }

    private int getMiddle(Integer[] array) {
        Arrays.sort(array);
        int min = 1;
        for (int i: array) {
            if (i != -1){
                min = i;
                break;
            }
        }
        for (int i = min + 1; i < totalCount; i++) {
            if(Arrays.binarySearch(array,i)<0) {
                return i;
            }
        }
        return 1;
    }

    //最后告诉你活着还是死了
    @Override
    public void result(boolean survived) {

    }
}
