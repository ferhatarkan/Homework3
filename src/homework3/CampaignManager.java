package homework3;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya indirim oran�yla eklendi : " + campaign.getDiscountRate());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println( campaign.getId() + " id nosuna sahip kampanya silindi. " );
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println( campaign.getId() + " id nosuna sahip kampanya g�ncellendi. " );
		
	}

}
