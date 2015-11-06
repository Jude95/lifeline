package com.jude.prisoner;

import com.jude.Prisoner;
improt com.jude.Manager;

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
		if else(((totalCount - last)/indx) > (totalCount / totalPerson)){
			return ((totalCount - last / indx + 1) - 1);
		}
		else{
			return (titalCount / totalPerson);
		}
	}
	
	@Override
	public void result(boolean survived){
		
	}
}