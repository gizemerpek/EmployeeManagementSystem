
public class CommisionEmployee extends Employee{
  public CommisionEmployee(String firstName, String lastName, String socialSecurityN, double grossSales,
			double commisionRate) {
		super(firstName, lastName, socialSecurityN);
		if(grossSales>=0) {
			this.grossSales = grossSales;
		}else {
			System.out.println("Wrong gross sales");
		}
		if(commisionRate>0 && commisionRate<1) {
		  this.commisionRate = commisionRate;
		}else {
			System.out.println("Wrong commision rate");
		}
	}
  private double grossSales;
  private double commisionRate;
  
public double getGrossSales() {
	return grossSales;
}
public void setGrossSales(double grossSales) {
	this.grossSales = grossSales;
}
public double getCommisionRate() {
	return commisionRate;
}
public void setCommisionRate(double commisionRate) {
	this.commisionRate = commisionRate;
}
@Override
public double getPaymentAmount() {
	// TODO Auto-generated method stub
	return commisionRate*grossSales;
}
@Override
public String toString() {
	return "commision employee: "+getFirstName()+" "+ getLastName()+ "\nsocial security number: "+getSocialSecurityN()+ "\ngross sales:$"+ getGrossSales()+
			"  commision rate: "+ getCommisionRate();
}



}

















