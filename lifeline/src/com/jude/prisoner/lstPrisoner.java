package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class lstPrisoner implements Prisoner {
	private int totalPerson,totalCount;

	@Override
	public String getName() {
		return "李尚庭2014214258";

	}

	@Override
	public void begin(Manager manager, int totalPerson, int totalCount) {
		 this.totalPerson = totalPerson;
	     this.totalCount = totalCount;
		
	}

	@Override
	public int take(int index, int last) {
		
		return last/(index+6);
	}

	@Override
	public void result(boolean survived) {
		
		
	}

}
