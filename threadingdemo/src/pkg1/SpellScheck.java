package pkg1;

public class SpellScheck extends Thread {
	Print p;
	
	public SpellScheck(Print p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.printTable(200);

	}

}
