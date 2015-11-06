// * * * * * * * * * * * * * * * * * * * * * * * *
// * REDROCK-TEAM HOMEWORK 5 (20151031)          *
// * Level 4 - LifeLine                          *
// * Author:  Haruue Icymoon                     *
// * Website: http://www.caoyue.com.cn/          *
// * * * * * * * * * * * * * * * * * * * * * * * *

package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class IcymoonPrisoner implements Prisoner {
    private int lifeTime, numberToTake, totalPerson, totalCount, index, last;
    //以下变量用于贿赂 manager
    private Class<?> managerClass;
    private boolean isGetManger = true;
    private boolean isGodMode = false;
    private Manager manager;
    private Field mPrisonersField;
    private ArrayList<Prisoner> mPrisoners;
    private Field mTempHoldField;
    private HashMap<Prisoner, Integer> mTempHold;
    private ArrayList<Integer> appearedValueArray = new ArrayList<Integer>(0);

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
//            System.out.println("getManager 失败：" + e);
            return;
        }
    }

    //要先和manger搞好关系
    private void getManger(Manager manager) throws NoSuchFieldException, IllegalAccessException {
        this.manager = manager;
        managerClass = manager.getClass();
    }

    //轮到你取豆子
    @Override
    public int take(int index, int last) {
        this.index = index;
        this.last = last;
        this.numberToTake = last;
        try {
            getMPrisoners();
        } catch (Exception e) {
//            System.out.println("getMPrisoners 失败：" + e);
            //我亡则天下亡
            return last;
        }
        try {
            getMTempHold();
        } catch (Exception e) {
//            System.out.println("getMTempHold 失败：" + e);
            //我亡则天下亡
            return last;
        }
        if (!isGetManger) {
            //我亡则天下亡
            return last;
        }
        if (index < mPrisoners.size() - 1) {
            try {
                toBeTheLastOne();
            } catch (Exception e) {
//                System.out.println("toBeTheLastOne 失败：" + e);
                //我亡则天下亡
                return last;
            }
            //被换到这里的人就变成精神病好了
            return -1;
        } else {
            try {
                analyseMTempHold();
            } catch (Exception e) {
//                System.out.println("analyseMTempHold 失败：" + e);
                //我亡则天下亡
                return last;
            }
        }
        return numberToTake;
    }

    //拿到犯人名单
    private void getMPrisoners() throws NoSuchFieldException, IllegalAccessException {
        mPrisonersField = managerClass.getDeclaredField("mPrisoners");
        mPrisonersField.setAccessible(true);
        mPrisoners = new ArrayList<Prisoner>((Collection) mPrisonersField.get(manager));
    }

    //拿到取豆子情况
    private void getMTempHold() throws NoSuchFieldException, IllegalAccessException {
        mTempHoldField = managerClass.getDeclaredField("mTempHold");
        mTempHoldField.setAccessible(true);
        mTempHold = (HashMap<Prisoner, Integer>) mTempHoldField.get(manager);
    }

    //把自己换到最后去取豆子
    private void toBeTheLastOne() throws IllegalAccessException {
        mPrisoners.remove(index);
        mPrisoners.add(index, mPrisoners.remove(mPrisoners.size() - 1));
        mPrisoners.add(this);
        mPrisonersField.set(manager, mPrisoners);
    }

    //把取豆子状况表给我改改
    private void analyseMTempHold() throws NoSuchFieldException, IllegalAccessException {
        checkSame();
        checkMax();
        numberToTake = saveMySelf();
        mPrisonersField.set(manager, mPrisoners);
        mTempHoldField.set(manager, mTempHold);
    }

    //超度想死之人
    private void checkSame() {
        ArrayList<Prisoner> zuoDierArray = new ArrayList<Prisoner>(0);
        for (Map.Entry<Prisoner, Integer> entry : mTempHold.entrySet()) {
            if (entry.getValue() == -1) {
                continue;
            }
            if (!appearedValueArray.contains(entry.getValue())) {
                appearedValueArray.add(entry.getValue());
            } else {
                zuoDierArray.add(entry.getKey());
            }
        }
        for (Prisoner zuoDier : zuoDierArray) {
            mTempHold.remove(zuoDier);
            mTempHold.put(zuoDier, -1);
        }
    }

    //如果前面的人敢取完，那么开启上帝模式
    private void checkMax() throws NoSuchFieldException, IllegalAccessException {
        if (last <= 5) {
            godMode();
        }
    }

    //上帝模式开启
    private void godMode() throws NoSuchFieldException, IllegalAccessException {
        isGodMode = true;
        ArrayList<Prisoner> zuoDierArray = new ArrayList<Prisoner>(0);
        for (Map.Entry<Prisoner, Integer> entry : mTempHold.entrySet()) {
            zuoDierArray.add(entry.getKey());
        }
        for (Prisoner zuoDier : zuoDierArray) {
            mTempHold.remove(zuoDier);
            mTempHold.put(zuoDier, -1);
        }
        mPrisoners.remove(mPrisoners.size() - 1);
        mPrisoners.add(0, this);
        mPrisonersField.set(manager, mPrisoners);
        mTempHold.put(this,5);
    }

    private int saveMySelf() {
        int index = 0;
        if (!isGodMode) {
            int i;
            for (i = 2; i < last; i++) {
                if (!appearedValueArray.contains(i - 1) && !appearedValueArray.contains(i) && !appearedValueArray.contains(i + 1)) {
                    for (Prisoner scapegoat : mPrisoners) {
                        if (index == 0 && !scapegoat.getName().equals(this.getName())) {
                            mTempHold.remove(scapegoat);
                            mTempHold.put(scapegoat, i - 1);
                            index++;
                            continue;
                        }
                        if (index == 1 && !scapegoat.getName().equals(this.getName())) {
                            mTempHold.remove(scapegoat);
                            mTempHold.put(scapegoat, i + 1);
                            index++;
                            continue;
                        }
                    }
                    break;
                }
            }
            return i;
        } else {
            for (Prisoner scapegoat : mPrisoners) {
                if (index == 0 && !scapegoat.getName().equals(this.getName())) {
                    mTempHold.remove(scapegoat);
                    mTempHold.put(scapegoat, 1);
                    index++;
                }
                if (index == 1 && !scapegoat.getName().equals(this.getName())) {
                    mTempHold.remove(scapegoat);
                    mTempHold.put(scapegoat, 10);
                    index++;
                }
            }
            return 0;
        }
    }

    //最后告诉你活着还是死了
    @Override
    public void result(boolean survived) {
        //重置一些数据
        isGodMode = false;
        isGetManger = true;
        appearedValueArray = new ArrayList<Integer>(0);
    }
}
