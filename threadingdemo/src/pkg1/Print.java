package pkg1;

public class Print {
	public synchronized void printTable(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i*n);
		}
	}
}
