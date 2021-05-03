package homework3;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales, Game game, Customer customer,Campaign campaign) {
		System.out.println(sales.getId()+"'li sipari�e ait olan "+game.getProductName()+" oyunu"+
				customer.getFirstName()+" "+customer.getLastName()+" m��terimize"+campaign.getDiscountRate() + "indirim oran�yla sat�ld�");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println(sales.getId()+" nolu sipari� silinmi�tir.");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println(sales.getId()+" nolu sipari� g�ncellenmi�tir.");

		
	}


}
