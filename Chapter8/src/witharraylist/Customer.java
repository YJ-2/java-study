package witharraylist;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer( ) {
		super();
		customerGrade="SILVER";
		bonusRatio=0.01;
		System.out.println("Customer() 호출");
	}
	
	public Customer(int customerId, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
		System.out.println("Customer(int, String) 호출");
	}
	
	
	public int calcPrice(int price) {
		if(customerGrade=="SILVER") {
			bonusPoint+=price*bonusRatio;
		}
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	
	public String getCustomerNmae() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade=customerGrade;
	}

}
