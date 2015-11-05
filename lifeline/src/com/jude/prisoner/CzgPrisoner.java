package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class CzgPrisoner implements Prisoner {
  int totalCount;
  int totalPerson;

  public String getName(){
    return "蔡振刚2015212185";
   }
   
   public void begin(Manager manager,int totalPerson,int totalCount){
    this.totalCount = totalCount;
    this.totalPerson = totalPerson;
    }
    
    public int take(int index, int last){
       //看不懂
       return((totalCount -last ) / (totalPerson + index) / 2);
    }//看不懂只能乱改
       
    public void result(boolean survived){
    
    }
    
  }
    
    
    
