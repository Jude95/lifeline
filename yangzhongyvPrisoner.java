public yangzhongyvPrisoner{

public interface Prisoner {
    //����������֣�ѧ��
    return (������+2015210130)//û���ҿ�������ֻ�ܵ������ˡ�������
    String getName();
    //����Ϸ��ʼ���������������������붹������
    void begin(Manager manager,int totalPerson,int totalCount);
    //�ֵ���ȡ����
    int take(int index, int last);
    //����������Ż�������
    void result(boolean survived);
}

}