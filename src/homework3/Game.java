package homework3;

public class Game implements Entity {
	private int id;
	private String productName;
	private int gameCategoryId;
	private int unitPrice;
	public Game(int id, String productName, int gameCategoryId, int unitPrice) {
		this.id = id;
		this.productName = productName;
		this.gameCategoryId = gameCategoryId;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getGameCategoryId() {
		return gameCategoryId;
	}
	public void setGameCategoryId(int gameCategoryId) {
		this.gameCategoryId = gameCategoryId;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
}
