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
        return "唐磊2015213872";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
    	int average = totalCount/totalPerson;
    	int lastaverage = last/(totalPerson - (index+1));  //我觉得可能应该可以用到平均数
    	if(index == 0 ){
    		return totalCount - totalPerson; //如果我在第一个，不要怪我了
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
