package chapter_eight.innerClass.innerClassInControlFramework;

import java.util.ArrayList;
import java.util.List;
//设计：使变化的事物与不变的事物相分离
/**
 * 1.用一个单独的类完整的实现一个控制框架，从而将实现的细节封装起来，
 * 内部类用来表示解决问题所必需的各种不同的action（）
 * 2.内部类能过轻易的访问外围类的任意成员，所以可以避免这种实现变得很笨拙
 * 如果没有这种能力，代码将变得很令人讨厌以至于你肯定会选择别的方法
 * @author Administrator
 *	控制框架：是一类特殊的应用程序框架，它用来解决相应事件的需求
 */
public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
//	constructor
	@SuppressWarnings("unused") 
	void addEvent(Event c){
		eventList.add(c);
	}
	public void run(){
		while(eventList.size() > 0){
			for(int i = 0; i< eventList.size();i++){
				Event e = (Event) eventList.get(i);
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(i);
				}
			}
		}
	}
}
