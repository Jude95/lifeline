package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;
/**
 * Created by meimei on 2015/10/31.
 */

public class MeimeiPrisoner implements Prisoner{

	private int totalPerson;
    private int totalCount;
    
	@Override
	public String getName() {
		return "梅建丰2014211783";
	}

	@Override
	public void begin(Manager manager, int totalPerson, int totalCount) {
		this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

	@Override
	public int take(int index, int last) {
		//我选择死亡
		return 1100;
	}

	@Override
	public void result(boolean survived) {
		
	}

}
