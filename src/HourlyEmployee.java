
public class HourlyEmployee extends Employee{
    public HourlyEmployee(String firstName, String lastName, String socialSecurityN, double wage, double hours) {
		super(firstName, lastName, socialSecurityN);
		if(wage>=0) {
		this.wage = wage;
		}else {
			System.out.println("Wrong wage");
		}
		if(hours>=0 && hours<168) {
		this.hours = hours;
		}else {
			System.out.println("Wrong hour");
		}
	}
	private double wage;
    private double hours;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		if(hours <=40) {
			return wage*hours;
		}else  {
			return  (40*wage + (hours -40)*wage*1.5);
		}
		
	}
	@Override
	public String toString() {
		return "hourly employee: "+getFirstName() + " " +getLastName() +"\nsocial security number: "+ getSocialSecurityN()+ "\nhourly wage:$"+
	getWage()+ "  hours worked: "+ getHours();
	}
	
	
	
	
	
	
	
}
