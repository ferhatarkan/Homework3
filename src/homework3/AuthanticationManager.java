package homework3;

public class AuthanticationManager implements AuthanticationService{
	EDevletAuthanticationService eDevletAuthanticationService = new EDevletAuthanticationService();
	@Override
	public boolean verifyCustomer(Customer customer) {
		
		if(eDevletAuthanticationService.IsValid(customer)) {
			return true;
			
		}
		return false;
	}

}
