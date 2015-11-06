package com.jude.prisoner;
import com.jude.Prisoner;
import com.jude.Manager;
/**
* Created by chenChanghong on 2015/11/6.
*/
 public class chenChanghongPrisoner implements Prisoner{
   int totalCount;
    int totalPerson;

    public String getName()
  {
       return "陈昶宏2015213957";
       }

    public void begin(Manager manager,int totalPerson, int totalCount)
    {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }
   public int take(int index, int last) {
     if(index==0||(index+1)==totalPerson)//生存或死亡这是个问题
     {
      return last;
      }
    else if（last>=(totalCount-last)/(index+1)）
    ｛
        return (totalCount-last)/(index+1);
    ｝
     
    }
    
    public void result(boolean survived) {

    }


}
