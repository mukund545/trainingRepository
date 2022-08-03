package Com.MyApp.Details.Service;

import java.util.List;

import Com.MyApp.Details.Entity.Transaction;

public interface TransactionService {

	Transaction saveTransaction(Transaction transaction);

	Object fetchTransaction(int pageNumber, int pageSize, String sortBy);

	List<Transaction> getAll();
	
	

}
