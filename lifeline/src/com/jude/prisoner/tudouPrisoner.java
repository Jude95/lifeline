package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by Mr.Jude on 2015/11/6.
 */
public class tudouPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "娄科2015211717";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }
    @Override
	  public int take(int indx,int last){
		  if(((totalCount - last)/indx) < (totalCount / totalPerson)){
			  return ((totalCount - last)/(indx - 1) + 1);
		}
		else if (((totalCount - last)/indx) > (totalCount / totalPerson)){
			return ((totalCount - last / indx + 1) - 1);
		}
		else
		{
			return (totalCount / totalPerson);
		}
		}
    @Override
    public void result(boolean survived) {

    }
}
