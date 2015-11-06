package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;
/**
 * Created by Administrator on 2015/11/5.
 */

public class JianJunPrisoner implements Prisoner{
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "潘建军2015212011";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        //我选择死亡。。那么多豆子好麻烦啊。。。。
     return 1000;
    }

    @Override
    public void result(boolean survived) {

    }
}
