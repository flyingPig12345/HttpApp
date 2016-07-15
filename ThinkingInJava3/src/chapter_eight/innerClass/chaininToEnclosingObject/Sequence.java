package chapter_eight.innerClass.chaininToEnclosingObject;
/**
 * 1.内部类自动拥有对其外围类的所有成员的访问权
 * @author Administrator
 * 2.内部类的对象只能在与其外部类的对象相关联的情况下才能被创建（？？？）
 */
public class Sequence {

	//属性  
	private Object [] objects;
	private int next = 0;
//	构造方法
	public Sequence(int size){
		objects = new Object[size];
	}
	//方法添加
	public void add(Object x){
		if(next < objects.length)
			objects[next++] = x;
	}
	//返回一个内部类的引用
	public Selector getSelecctor(){
		return new SSelector();
	}
	public static void main(String args[]){
		Sequence sequence = new Sequence(10);
		for(int i = 0; i<10;i++){
			sequence.add(Integer.toString(i));
		}
		Selector selector =sequence.getSelecctor();
		while(!selector.end()){
			System.out.println(selector.current());
			selector.next();
		}
	}
	//内部类   SSelector   
	private class SSelector implements Selector{

		private int i = 0;
		public boolean end(){
			return i == objects.length;
		}
		public Object current(){
			return objects[i];
		}
		public void next(){
			if(i<objects.length)
				i++;
		}
	}
}
