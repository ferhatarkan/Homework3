package homework3;

public class CustomerManager implements CustomerService{

	@Override
	public void addCustomer(Customer customer) {
		System.out.println("M��teri eklendi:" + customer.getFirstName());
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("M��teri g�ncellendi:" + customer.getFirstName());
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println("M��teri silindi:" + customer.getFirstName());
	}

}
