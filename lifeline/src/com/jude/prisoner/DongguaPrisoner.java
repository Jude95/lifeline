
package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Administrator on 2015/10/31.
 */
public class DongguaPrisoner implements Prisoner {

    int totalPerson;
    int totalCount;

    @Override
    public String getName() {
        return "DongGua2015211478";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

    @Override
    public int take(int index, int last) {
        if(index < 2 ){
            return ((totalCount-last)/(index+1) + totalCount/totalPerson)/2 + 2*totalPerson;//��һ��ʵ�����벻��ʲô�õķ����ˣ�����������İɡ���������Ȼ����һ�£����ǽ�(��)��(Ϯ)����¡�����
        }
        else {
            return (totalCount - last)/index + (totalCount/totalPerson - (totalCount - last)/index)/index;
        }
    }

    @Override
    public void result(boolean survived) {

    }
}
