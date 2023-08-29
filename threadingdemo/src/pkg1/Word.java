package pkg1;

public class Word {
	public static void main(String[] args) {
		Print pr=new Print();
		AutoSave t1=new AutoSave(pr);
		SpellScheck t2=new SpellScheck(pr);
		t1.start();
		t2.start();
	}
}
