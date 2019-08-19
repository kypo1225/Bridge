package bridge_test;

public class Character {

	CharacterZissou zissou;

	public Character(CharacterZissou z) {
		this.zissou = z;
	}

	public void runMethod() {
		zissou.run();
	}
}
