package springIntro;

public class CustomerManager implements ICustomerService{
	ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void addCustomer() {
		customerDal.add();
	}
	
	

}
