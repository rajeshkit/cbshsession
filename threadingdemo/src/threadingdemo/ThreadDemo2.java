package threadingdemo;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Task");
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Runnable r=new ThreadDemo2();// type of Runnable
		Thread t1=new Thread(r);
		t1.start();
		Thread t2=new Thread(r);
		t2.start();
		
		//new ThreadDemo2();	// type of runnable
//		System.out.println(Thread.currentThread().getName());
//		Thread t1=new Thread(new ThreadDemo2());
//		t1.start();
//		Thread t2=new Thread(new ThreadDemo2());
//		t2.start();
//		Thread t3=new Thread(new ThreadDemo2());
//		t3.start();
	}
}
