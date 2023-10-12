
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Payable payableObjects[] = new Payable[6];

                 payableObjects[0]=new Invoice("01234","(seat)",2, 375.00);
        		 payableObjects[1]=new Invoice("56789","(tire)",4, 79.95);
        		 payableObjects[2]=new SalariedEmployee("John","Smith","111-11-1111", 800.00);
        		 payableObjects[3]=new HourlyEmployee("Karen","Price","222-22-2222", 16.75, 40.00);
        		 payableObjects[4]=new CommisionEmployee("Sue","Jonas","333-33-3333", 10000.00, 0.06);
        		 payableObjects[5]=new BasePlusCommisionEmployee("Bob","Lewis","444-44-4444",5000.00, 0.04, 300.00);
        		 
        		double a=   (BasePlusCommisionEmployee.getBaseSalary() +BasePlusCommisionEmployee.getBaseSalary()*0.1);
        		 
        		 System.out.println("----------Invoices and Employees processed polymorphically---------\n\n");
        		 
        		 for(int i=0;i<payableObjects.length;i++) {
        			 if(payableObjects[i] instanceof BasePlusCommisionEmployee) {
        				((BasePlusCommisionEmployee) payableObjects[i]).setBaseSalary(a);
        				System.out.println(payableObjects[i].toString()+"\nnew base salary with %10 increase is:$"+ a);
        		 }else {
        			 System.out.println(payableObjects[i].toString());
        		 }
        			 System.out.println("payment amount:$ "+payableObjects[i].getPaymentAmount()+"\n");
        			
        		 }
        		 System.out.println();
        		 for(int j=0; j<payableObjects.length; j++) {
        			System.out.println("Payable object "+j+" is a "+ payableObjects[j].getClass().getName());
        		 }
	}

	
}
