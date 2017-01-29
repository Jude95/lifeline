import com.jude.*;
import java.util.*;
public class MaxTuoerZhongIsNotPrisoner{
	public static void main(String [] args){
	Prisoner[] mPrisoners=new Prisoner[100];
	Manager man=new Manager(mPrisoners,5000);
	ZhongYiIsNot zyi=new ZhongYiIsNot();
	zyi.begain(man,100,5000);
	}
}
class ZhongYiIsNot{
	public String getName(){
		return "Zhongyi 2015212024";
	}
	public void begain(Manager manager ,int totalPerson,int totalCount){
		System.out.println("犯人总人数="+totalPerson+" ; 总豆子数"+totalCount);
	}
	public int take(int index ,int last){
		return index-last/2;
	}
	public void result(boolean survived){
		
	}
}
//表示 我的java书有问题啊 我还没学集合包 我先学的线程。。。 怎么一下搞了这么多 数组 表 
