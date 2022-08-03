package Com.MyApp.Details.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Com.MyApp.Details.Entity.Transaction;
import Com.MyApp.Details.Repository.TransactionRepository;
import Com.MyApp.Details.Service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public Transaction saveTransaction(Transaction transaction) {
	
		return transactionRepository.save(transaction);
	}

	@Override
	public Object fetchTransaction(int pageNumber, int pageSize, String sortBy) {
		
		Pageable p = PageRequest.of(pageNumber, pageSize,Sort.by(sortBy));
		Page<Transaction> pages = transactionRepository.findAll(p);
		
		return pages;
	}

	@Override
	public List<Transaction> getAll() {
		
		return transactionRepository.findAll();
	}

}
