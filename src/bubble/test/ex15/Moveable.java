package bubble.test.ex15;

public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
	
	//다중상속이 안되는 문제때문에 adapter 패턴보다는 default를 사용하는 것이 좋다
	default public void down() {};
	default public void attack() {};
}
