
public class Invoice implements Payable {
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(quantity>=0) {
		this.quantity = quantity;
		}else {
			System.out.println("Wrong quantity");
		}
		if(pricePerItem>0) {
		this.pricePerItem = pricePerItem;
		}else {
			System.out.println("Wrong price");
		}
	}
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return (quantity*pricePerItem);
	}
	@Override
	public String toString() {
		return "Invoice:\npart Number:" + partNumber  + partDescription +"\nquantity=" + quantity
				+"\nprice per item=$" + pricePerItem ;
				
	}
	

	}
	


