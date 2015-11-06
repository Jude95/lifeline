package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class HanLiangPrisoner implements Prisoner{
	int totalCount;
	int totalPerson;
	
	@Override
	public String getName(){
		return"韩亮2015210862";
	}
	
	@Override
	public void begin(Manager manager,int totalPerson,int totalCount){
		this.totalPerson = totalPerson;
		this.totalCount = totalCount;
	}
	
	@Override
	public int take(int indx,int last){
		if(((totalCount - last)/indx) < (totalCount / totalPerson)){
			return ((totalCount - last)/(indx - 1) + 1);
		}
		else if (((totalCount - last)/indx) > (totalCount / totalPerson)){
			return ((totalCount - last / indx + 1) - 1);
		}
		else{
			return (totalCount / totalPerson);
		}
	}
	
	@Override
	public void result(boolean survived){
		
	}
}