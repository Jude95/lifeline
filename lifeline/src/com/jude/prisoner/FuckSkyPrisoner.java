package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class FuckSkyPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "����2015213872";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
    	int average = totalCount/totalPerson;
    	int lastaverage = last/(totalPerson - (index+1));  //�Ҿ��ÿ���Ӧ�ÿ����õ�ƽ����
    	if(index == 0 ){
    		return totalCount - totalPerson; //������ڵ�һ������Ҫ������
    	}
    	else{
    		if(lastaverage > average){
    			return average;
    		}
    		if(lastaverage < average){
    			return average+1;
    		}
    		else{
    			return average-1;
    		}
    	}
    }

    @Override
    public void result(boolean survived) {

    }

}
