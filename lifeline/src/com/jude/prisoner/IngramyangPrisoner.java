package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by ingra on 2015-11-06.
 */
public class IngramyangPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "���Ӵ�2015211670";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return (int)(totalCount * 0.98/ totalPerson);
    }

    @Override
    public void result(boolean survived) {

    }
}
//���ǲ����Ҿ���Ϊ�˽�github��ҵ==
