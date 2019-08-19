package bridge_test;

public class Main {
	public static void main(String[] args) {
		Heros h = new Heros(new CharacterC());
		h.fly();

		h.zissou.run();

	}
}
