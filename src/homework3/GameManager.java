package homework3;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getProductName() +" eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getProductName() +" güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getProductName() +" silindi");
	}

	@Override
	public void getAllGame(Game[] games) {
		System.out.println("Oyunlar listesi:");
		for(Game game: games) {
			System.out.println(game.getProductName());
		}
		
	}

}
