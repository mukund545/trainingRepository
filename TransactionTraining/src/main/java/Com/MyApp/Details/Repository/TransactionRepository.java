package Com.MyApp.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.MyApp.Details.Entity.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction,Integer>  {

}
