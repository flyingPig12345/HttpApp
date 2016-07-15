package chapter_ten.instacneof;

import java.util.Random;
/**
 * 价格   x instancefo  Y   修改为 XXclass.isInstance(x) 并用循环进行比较
 * @author Administrator
 *
 */
public class Test2Update2 {
	private static Random rand = new Random();

	public static void main(String args[]) {
		Object[] pets = new Object[15];
		Class[] petTypes = { Pet.class, Dog.class, Pug.class, Cat.class,
				Rodent.class, Gerbil.class, Hamster.class };
		
		try {
			//随机生成15只宠物
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
		Test map = new Test(petTypes.length);
		for (int i = 0; i < petTypes.length; i++) {
			map.put(petTypes[i].getName().toString(), new Counter());
		}
		//外层是宠物
		for(int i = 0;i<pets.length;i++){
			Object o = pets[i];
//			每个宠物判断一下是什么类型的
			for( int j = 0;j< petTypes.length;++j){
				if(petTypes[j].isInstance(o)){
					((Counter)map.get(petTypes[j].getName().toString())).i++;
				}
			}
		
		}
//		输出结果
		for(int i = 0;i<pets.length;i++){
//			System.out.println(pets[i].getClass());
		}
		System.out.println(map);
	}
}
