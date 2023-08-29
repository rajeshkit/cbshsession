package pkg2;

public class Word {
	public static void main(String[] args) {
		Thread t1=new Thread(new Typing());//Typing task
		Thread t2=new Thread(new AutoSave());//Auto Save task
		Thread t3=new Thread(new SpellScheck());//Spell Check task
		t1.start();// typing class run method 
		t2.start();// auto save class run method 
		t3.start();// spell check of run method
	}
}
