
public class BasePlusCommisionEmployee extends CommisionEmployee {
  public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityN, double grossSales,
			double  commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityN, grossSales, commisionRate);
		if(baseSalary>=0) {
				this.baseSalary = baseSalary;
		}else {
			System.out.println("Wrong base salary");
		}
	}

private static double baseSalary;

public static double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

@Override
public double getPaymentAmount() {
	// TODO Auto-generated method stub
	return  ((getCommisionRate()*getGrossSales())+ baseSalary);
}
@Override
public String toString() {
	return "base salaried commision employee: "+ getFirstName()+ " "+getLastName()+"\nsocial security number:"+getSocialSecurityN()+"\ngross sales:$"
			+getGrossSales()+"  commision rate: "+getCommisionRate()+ "  base salary:$"+ getBaseSalary();
}
}
