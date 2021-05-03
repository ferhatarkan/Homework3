package homework3;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales, Game game, Customer customer,Campaign campaign) {
		System.out.println(sales.getId()+"'li sipariþe ait olan "+game.getProductName()+" oyunu"+
				customer.getFirstName()+" "+customer.getLastName()+" müþterimize"+campaign.getDiscountRate() + "indirim oranýyla satýldý");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println(sales.getId()+" nolu sipariþ silinmiþtir.");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println(sales.getId()+" nolu sipariþ güncellenmiþtir.");

		
	}


}
