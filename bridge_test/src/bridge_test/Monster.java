package bridge_test;

public class Monster extends Character{

	public Monster(CharacterZissou z) {
		super(z);
	}

	public void hoeru() {
		System.out.println("monsterはほえました");
	}
}
