public yangzhongyvPrisoner{

public interface Prisoner {
    //返回你的名字＋学号
    return (杨忠宇+2015210130)//没错。我看不懂，只能到这里了。。。。
    String getName();
    //当游戏开始，告诉你囚犯总人数，与豆子总数
    void begin(Manager manager,int totalPerson,int totalCount);
    //轮到你取豆子
    int take(int index, int last);
    //最后告诉你活着还是死了
    void result(boolean survived);
}

}