package homework3;

public class CustomerManager implements CustomerService{

	@Override
	public void addCustomer(Customer customer) {
		System.out.println("Müþteri eklendi:" + customer.getFirstName());
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Müþteri güncellendi:" + customer.getFirstName());
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println("Müþteri silindi:" + customer.getFirstName());
	}

}
