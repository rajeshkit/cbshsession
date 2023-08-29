package pkg1;

public class AutoSave extends Thread{
	Print p;
	
	
	public AutoSave(Print p) {
		super();
		this.p = p;
	}


	@Override
	public void run() {
		p.printTable(10);

		
	}

}
