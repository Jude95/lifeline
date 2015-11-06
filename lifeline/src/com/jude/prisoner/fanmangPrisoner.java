package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by lenov on 2015/11/6.
 */
public class fanmangPrisoner {
    public class fanmang implements Prisoner {
        int totalCount;
        int totalPerson;

        @Override
        public String getName() {
            return "凡芒2015214165";
        }

        @Override
        public void begin(Manager manager,int totalPerson, int totalCount) {
            this.totalCount = totalCount;
            this.totalPerson = totalPerson;
        }

        @Override
        public int take(int index, int last) {
            return ((totalCount-last)/(index+1) + totalCount/totalPerson)/2;
        }

        @Override
        public void result(boolean survived) {

        }

    }
}
