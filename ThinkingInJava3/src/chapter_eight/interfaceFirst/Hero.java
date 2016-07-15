package chapter_eight.interfaceFirst;

public class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{

	@Override
	public void fly() {
		System.out.println("fly");
	}

	@Override
	public void swim() {
		System.out.println("swim");
	}

}
