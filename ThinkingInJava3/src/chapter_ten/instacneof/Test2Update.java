package chapter_ten.instacneof;

import java.util.Random;
/**
 * 与test2不同的地方是    宠物的加载方式由Class.forName();修改为Peg.class
 * @author Administrator
 *
 */
public class Test2Update {

	private static Random rand = new Random();

	public static void main(String args[]) {
		Object[] pets = new Object[15];
		Class[] petTypes = { Pet.class, Dog.class, Pug.class, Cat.class,
				Rodent.class, Gerbil.class, Hamster.class };
		try {
			for (int i = 0; i < pets.length; i++) {
				int rnd = 1 + rand.nextInt(petTypes.length - 1);
				pets[i] = petTypes[rnd].newInstance();
			}
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		//随机生成15只狗狗
		Test map = new Test(petTypes.length);
		for (int i = 0; i < petTypes.length; i++) {
			map.put(petTypes[i].getName().toString(), new Counter());
		}
		//判断是宠物是那个种类
		for(int i = 0;i<pets.length;i++){
			Object o = pets[i];
			if(o instanceof Pet){
				((Counter)map.get("chapter_ten.instacneof.Pet")).i++;
			}
			if(o instanceof Dog){
				((Counter)map.get("chapter_ten.instacneof.Dog")).i++;
			}
			if(o instanceof Pug){
				((Counter)map.get("chapter_ten.instacneof.Pug")).i++;
			}
			if(o instanceof Cat){
				((Counter)map.get("chapter_ten.instacneof.Cat")).i++;
			}
			if(o instanceof Rodent){
				((Counter)map.get("chapter_ten.instacneof.Rodent")).i++;
			}
			if(o instanceof Gerbil){
				((Counter)map.get("chapter_ten.instacneof.Gerbil")).i++;
			}
			if(o instanceof Hamster){
				((Counter)map.get("chapter_ten.instacneof.Hamster")).i++;
			}
		}
		//输出结果
		for(int i = 0;i<pets.length;i++){
			System.out.println(pets[i].getClass());
		}
		System.out.println(map);
	}
}
