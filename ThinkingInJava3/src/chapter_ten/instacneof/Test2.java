package chapter_ten.instacneof;

import java.util.Random;
/**
 * 分别计数的时候，可以用此方法
 * 1.创建一个counter类    
 * 并将counter 的头String 方法重写是指仅仅输出 用于计数的数字
 * 2.将所要计数的种类用map承装   map.put("aa",new Counter());
 * @author Administrator
 * 类的加载方式  Class.forName("").newInstance();
 */
public class Test2 {
	
	private static Random rand = new Random();
	static String [] typenames = {
		"Pet","Dog","Pug","Cat",
		"Rodent","Gerbil","Hamster",
	};
	
	public static void main(String args[]){
		Object[] pets = new Object[15];
		try {
			Class [] petTypes = {
					Class.forName("chapter_ten.instacneof.Dog"),
					Class.forName("chapter_ten.instacneof.Pug"),
					Class.forName("chapter_ten.instacneof.Cat"),
					Class.forName("chapter_ten.instacneof.Rodent"),
					Class.forName("chapter_ten.instacneof.Gerbil"),
					Class.forName("chapter_ten.instacneof.Hamster"),
			};
			//遍历 随机生成15只宠物狗
			for(int i = 0;i< pets.length; i++){
					pets[i] = petTypes[rand.nextInt(petTypes.length)].newInstance();
			}
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
		} catch (ClassNotFoundException e) {
			System.out.println("class not find");
			System.exit(1);
		}
		//easyMap
		Test map = new Test(typenames.length);
		//遍历狗的种类
		for(int i = 0;i<typenames.length;i++)
			map.put(typenames[i], new Counter());
		//遍历每一只狗，判断是哪种，就将那只狗的数量加1
		for(int i = 0;i<pets.length;i++){
			Object o = pets[i];
			if(o instanceof Pet){
				((Counter)map.get("Pet")).i++;
			}
			if(o instanceof Dog){
				((Counter)map.get("Dog")).i++;
			}
			if(o instanceof Pug){
				((Counter)map.get("Pug")).i++;
			}
			if(o instanceof Cat){
				((Counter)map.get("Cat")).i++;
			}
			if(o instanceof Rodent){
				((Counter)map.get("Rodent")).i++;
			}
			if(o instanceof Gerbil){
				((Counter)map.get("Gerbil")).i++;
			}
			if(o instanceof Hamster){
				((Counter)map.get("Hamster")).i++;
			}
			System.out.println(map);
		}
		
		for(int i = 0;i<pets.length;i++){
//			System.out.println(pets[i].getClass());
		}
		System.out.println(map);
		
	}

}
