import java.util.Scanner;

public class LicCustomer {
	int planNo;
	int age;
	int maturity;
	int tenure;
	
	public LicCustomer(int planNo, int age, int maturity, int tenure) {
		super();
		this.planNo = planNo;
		this.age = age;
		this.maturity = maturity;
		this.tenure = tenure;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the planno");
		int planNo=s.nextInt();//100
		System.out.println("Enter the Age");
		int age=s.nextInt();//35
		System.out.println("Enter the tenure");
		int tenure=s.nextInt();//34
		System.out.println("Enter the Maturity");
		int maturity=s.nextInt();//2000000
		Lic lic=new Lic();
		/*
		 * long amount=lic.premiumCalculator(planNo, age, tenure, maturity);
		 * System.out.println(amount);
		 */		
		LicCustomer licCustom=new LicCustomer(planNo,age,tenure,maturity);
		lic.premiumCalculator(licCustom);//404040
	}
	
	
	
	
	
	
}
