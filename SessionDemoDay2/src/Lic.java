
public class Lic {
	public long premiumCalculator(int planno,int age,int tenure,int maturity) {
		long premium = tenure*maturity/100;
		return premium;
		
	}										//404040
	public long premiumCalculator(LicCustomer licCustomer) {
		//long premium = tenure*maturity/100;
		System.out.println(licCustomer.planNo+" "+licCustomer.age);
		System.out.println(licCustomer.maturity+" "+licCustomer.tenure);
		return 0;
		
	}
}
