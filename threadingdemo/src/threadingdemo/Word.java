package threadingdemo;

public class Word {
	public static void main(String[] args) {
		Typing t1=new Typing();
		t1.setName("t1");
		SpellCheck t2=new SpellCheck();
		t2.setName("t2");
		AutoSave t3=new AutoSave();
		t3.setName("t3");
		t1.start();// implicitly run method typing 
		t2.start();// implicitly run method spell check
		t3.start();// implicitly run method Auto Save
	}

}
