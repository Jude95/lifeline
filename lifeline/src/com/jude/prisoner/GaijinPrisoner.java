package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Mr.Jude on 2015/10/28.
 */
public class GaijinPrisoner implements Prisoner {
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
    	int average = totalCount / totalPerson;
    	int lastaverage = (totalCount - last)/index;
    	if(index == 0 ){
    		return average;
    	}
    	else{
    		if(lastaverage<average){
    			return lastaverage-1;
    		}
    		if(lastaverage>average){
    			return lastaverage+1;
    		}
    		else{
    			return lastaverage;
    		}
    	}
    }

    @Override
    public void result(boolean survived) {

    }

}


