package threadingdemo;

public class AutoSave extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Auto Save");
		}
	}
	public static void main(String[] args) {
		AutoSave as=new AutoSave();
		as.start();
	}
}
