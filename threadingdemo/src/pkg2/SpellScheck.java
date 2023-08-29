package pkg2;

public class SpellScheck implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Spell Check");
		}

	}

}
