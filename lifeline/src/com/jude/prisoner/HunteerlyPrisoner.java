package lifeline.src.com.jude.prisoner;

/**
 * Created by lxx569378712m on 2015/11/6.
 */
public class HunteerlyPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "林兴祥2015212945";
    }

    @Override
    public void begin(Manager manager,int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {

            return totalCount-totalPerson;//我要团灭
        }

    @Override
    public void result(boolean survived) {
    }
}
