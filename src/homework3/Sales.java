package homework3;

public class Sales implements Entity{
	private int id;
	private int customerId;
	private String salesDate;
	public Sales(int id, int customerId, String salesDate) {
		this.id = id;
		this.customerId = customerId;
		this.salesDate = salesDate;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
