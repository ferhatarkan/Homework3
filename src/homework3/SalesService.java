package homework3;

public interface SalesService {
	void add(Sales sales,Game game,Customer customer,Campaign campaign);
	void delete(Sales sales);
	void update(Sales sales);
}
