package chapter_ten.RTTI;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	Toy() {
	}

	Toy(int i) {
	}
}
/**
 * class 实现  RTTI
 * @author Administrator
 *
 */
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	static {
		System.out.println("firsts");
	}
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name : " + cc.getName() + " is interface?["
				+ cc.isInterface() + "]");
	}

	public static void main(String args[]) {
		Class c = null;
		try {
			c = Class.forName("chapter_ten.RTTI.FancyToy");

		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancytToy");
			System.exit(1);
		}
		printInfo(c);
		Class[] faces = c.getInterfaces();
		for (int i = 0; i < faces.length; i++) {
			printInfo(faces[i]);
			Class cy = c.getSuperclass();
			Object o = null;
			try {
				o = cy.newInstance();
				printInfo(o.getClass());
			} catch (InstantiationException e) {
				System.out.println("Cannot instantiate");
				System.exit(1);
			} catch (IllegalAccessException e) {
				System.out.println("Cannot access");
				System.exit(1);
			}
		}
	}
}