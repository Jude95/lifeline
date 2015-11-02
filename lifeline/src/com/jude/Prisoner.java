package com.jude;

/**
 * Created by Mr.Jude on 2015/10/28.
 * 这是个有趣的实验，你们都是囚犯，给你们N颗豆子，你们随便拿。
 * 最后拿的最多和最少的人死。如果2及以上个人拿了一样的个数，全部死。
 * 相信你们都想活下来。
 *
 * 不要以为上百人参与，一次死2人活下来机率很大。大量实验会使你活下来的概率在统计数据上体现出来。
 */


public interface Prisoner {
    //返回你的名字＋学号
    String getName();
    //当游戏开始，告诉你囚犯总人数，与豆子总数
    void begin(Manager manager,int totalPerson,int totalCount);
    //轮到你取豆子
    int take(int index, int last);
    //最后告诉你活着还是死了
    void result(boolean survived);
}
