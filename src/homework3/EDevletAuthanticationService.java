package homework3;

public class EDevletAuthanticationService {
	public boolean IsValid(Customer customer) {
		if( customer.getIdentityNumber() == "1234567"&&  
				customer.getFirstName() == "ferhat" && 
				customer.getLastName() == "arkan" && 
				customer.getDateOfBirth() == 1995) {
			return true;
			}
		return false;
		
	}
}
