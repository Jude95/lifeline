package lifeline.src.com.jude.prisoner;

/**
 * Created by lxx569378712m on 2015/11/6.
 */
public class HunterPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "������2015212945";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return totalCount-totalPerson;//��Ҫ����
    }
    @Override
    public void result(boolean survived) {

    }
}
