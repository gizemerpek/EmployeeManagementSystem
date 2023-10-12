
public class SalariedEmployee extends Employee {

public SalariedEmployee(String firstName, String lastName, String socialSecurityN, double weeklySalary) {
		super(firstName, lastName, socialSecurityN);
		if(weeklySalary>=0) {
		this.weeklySalary = weeklySalary;
		}
	}

private double weeklySalary;

public double getWeeklySalary() {
	return weeklySalary;
}

public void setWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
}

@Override
public double getPaymentAmount() {
	// TODO Auto-generated method stub
	return weeklySalary;
}
@Override
public String toString() {
	return "salaried employee: "+ getFirstName() + " "+getLastName() +"\nsocial security number: "+ getSocialSecurityN()+"\nweekly salary:$"+getWeeklySalary()
;
}
}
