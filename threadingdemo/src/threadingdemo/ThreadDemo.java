package threadingdemo;

public class ThreadDemo extends Thread {
	String threadName;
	public ThreadDemo() {
		// TODO Auto-generated constructor stub
	}
	public ThreadDemo(String threadName) {
		super(threadName);
		this.threadName = threadName;
	}

	@Override
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadDemo t1 = new ThreadDemo("Thread t1");
		ThreadDemo t2 = new ThreadDemo("Thread t3");
		ThreadDemo t3 = new ThreadDemo("Thread t2");
		
		t3.start();
		t1.start();
		t2.start();
	}
}
