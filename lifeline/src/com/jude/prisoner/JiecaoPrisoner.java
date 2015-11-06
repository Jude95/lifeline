package com.jude.Prisoner;

import com.jude.Manager;

import com.jude.Prisoner;

/**
 * Created by Jiecao on 2015/11/4.
 */

public class JiecaoPrisoner implements Prisoner {

	int totalCount;
	int totalPerson;
	
	@Override
	
	public String getName() {
		return "刘博文2015210866";
	}
	
	@Override
	public void begin(Manager manager, int totalPerson, int totalCount){
		
		this.totalCount = totalCount;
		this.totalPerson = totalPerson;
	}
	
	public int take(int index, int last){
		if (index == 0)
			
			return totalCount;
		
		else {
			if ((totalCount - last)/index >= totalCount/totalPerson)
			
				return totalCount/totalPerson - 5;
			else
				return totalCount/totalPerson + 3;
					
		}
	}
	
	@Override
	
	public void result(boolean survived){
	}
	}
