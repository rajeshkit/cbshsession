package abstractiondemo;

public interface Human{
	int a=45; //jvm treat the variable as public final
	void doTask(); //jvm treat as public abstract method
	void sleep();
}
