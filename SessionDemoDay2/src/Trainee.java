
public class Trainee {
	int traineeId;
	String traineeName;
	int phone;
	static String companyName="HSBC";
	      
	public Trainee(int traineeId, String traineeName, int phone) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.phone = phone;
	}

	void displayTrainee() {
		System.out.println(traineeId);
		System.out.println(traineeName);
		System.out.println(phone);
		
	}
	public static void main(String[] args) {
		Trainee t1=new Trainee(123,"abc",97877);
		Trainee t2=new Trainee(124,"bcd",99977);
		Trainee t3=new Trainee(125,"ecd",88977);
		
		t1.displayTrainee();
		t2.displayTrainee();
		t3.displayTrainee();
		System.out.println(Trainee.companyName);
		
		
	}
}
