package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class ZdjPrisoner implements Prisoner {
	private int totalPerson,totalCount;

	@Override
	public String getName() {
		return "郑代建2015214086";

	}

	@Override
	public void begin(Manager manager, int totalPerson, int totalCount) {
		 this.totalPerson = totalPerson;
	     this.totalCount = totalCount;
		
	}

	@Override
	public int take(int index, int last) {
		
		return (totalCount-last)/2(index+1)+last/2(index+6);
	}

	@Override
	public void result(boolean survived) {
		
		
	}

}
