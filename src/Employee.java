
public abstract class Employee implements Payable {
 
public Employee(String firstName, String lastName, String socialSecurityN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityN = socialSecurityN;
	}
private String firstName;
private String lastName;
private String socialSecurityN;


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSocialSecurityN() {
	return socialSecurityN;
}
public void setSocialSecurityN(String socialSecurityN) {
	this.socialSecurityN = socialSecurityN;
}
@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityN=" + socialSecurityN + "]";
}

















}
