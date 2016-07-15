package chapter_seven.combination;

public class Stage {

	private Actor actor = new HappyActor();
	public void change(){
		actor = new SadActor();
	}
	public void performPlay(){
		actor.act();
	}
}
