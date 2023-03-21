package bubble.test.ex11;

//어댑터 패턴  -> 걸러내는 역할... 하지만 다중상속의 한계
public abstract class MoveAdapter implements Moveable {

	@Override
	public void down() {}

}
