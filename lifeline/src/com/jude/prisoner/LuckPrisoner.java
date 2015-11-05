package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class LuckPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;
	
	public String getName(){
		return "姜波 2015214036";
	}
	 public void begin(Manager manager,int totalPerson, int totalCount){
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }
	public int take(int index, int last) {
        return 250；  //这个数字很有意义嘛...物极必反，老夫多年的经验教训....求收藏！！！
    }
	 public void result(boolean survived) {

    }
}