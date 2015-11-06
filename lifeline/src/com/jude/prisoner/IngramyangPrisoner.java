/**
 * Created by ingra on 2015-11-06.
 */
public class IngramyangPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;

    @Override
    public String getName() {
        return "杨子聪2015211670";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return (int)(totalCount * 0.98/ totalPerson);
    }

    @Override
    public void result(boolean survived) {

    }
}
//就是不懂我就是为了交github作业==
