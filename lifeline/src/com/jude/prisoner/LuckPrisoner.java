package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class LuckPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;
	
	public String getName(){
		return "���� 2015214036";
	}
	 public void begin(Manager manager,int totalPerson, int totalCount){
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }
	public int take(int index, int last) {
        return 250��  //������ֺ���������...�Ｋ�ط����Ϸ����ľ����ѵ....���ղأ�����
    }
	 public void result(boolean survived) {

    }
}