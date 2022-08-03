package Com.MyApp.Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.Entity.Transaction;
import Com.MyApp.Details.Service.TransactionService;


@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping
	public 	Transaction addTransaction(@RequestBody Transaction transaction)
	{
		return transactionService.saveTransaction(transaction);
	}
	
	@GetMapping
	public 	Object getTransactions(@RequestParam(value = "pageNumber",defaultValue = "0",required = false)int pageNumber,
            @RequestParam(value = "pageSize",defaultValue ="2",required = false)int pageSize,
            @RequestParam(value = "sortBy",defaultValue ="transactionId",required = false)String sortBy)
	{
		return transactionService.fetchTransaction(pageNumber,pageSize,sortBy);
	}
	
	@GetMapping("/fetch")
	public 	List<Transaction> getAllTransaction()
	{
		return transactionService.getAll();
	}


}
