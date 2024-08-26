package BankProject;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Bank_Dao 
{
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//Bank
	public Bank saveBank(Bank b)
	{
		et.begin();
		em.persist(b);
		et.commit();
		return b;
		
	}
	
	public Bank findBank(int id)
	{
		Bank b1=em.find(Bank.class, id);
		return b1;
		
	}
	
	public Bank deleteBank(int id)
	{
		Bank bank=em.find(Bank.class, id);
		if(bank!=null)
		{
			et.begin();
			em.remove(bank);
			et.commit();
			return bank;
		}
		return null;
	}
	
	 public Bank updateBank(Bank bank, int id) {
	        Bank dbBank = em.find(Bank.class, id);
	        if (dbBank != null) {
	            bank.setId(id);
	            et.begin();
	            em.merge(bank);
	            et.commit();
	            return bank;
	        }
	        return null;
	    }
	
	public List<Bank>getAllBanks()
	{
		Query query=em.createQuery("select b from Bank b");
		List<Bank>allbanks=query.getResultList();
		if(!allbanks.isEmpty())
		{
			return allbanks;
		}
		else {
			return null;
		}
		
	}
	
	//Manager
	
	public Manager saveManager(Manager m)
	{
		et.begin();
		em.persist(m);
		et.commit();
		return m;
	}
	
	
	 public Manager findManager(int id) {
	        Manager manager = em.find(Manager.class,id);
	        return manager;
	    }
	
	 public Manager deleteManager(int id) {
	        Manager man = em.find(Manager.class, id);
	        if (man != null) {
	            et.begin();
	            em.remove(man);
	            et.commit();
	            return man;
	        }
	        return null;
	    }
	 
	 public Manager updateManager(Manager manager, int id) {
	        Manager dbManager = em.find(Manager.class, id);
	        if (dbManager != null) {
	            manager.setId(id);
	            et.begin();
	            em.merge(manager);
	            et.commit();
	            return manager;
	        }
	        return null;
	    }
	
	
	
	public List<Manager>getAllManages()
	{
		Query query=em.createQuery("select m from manager m");
		List<Manager>allmanagers=query.getResultList();
		if(!allmanagers.isEmpty())
		{
			return allmanagers;
		}
		else {
			return null;
		}
	}
	
	//Customer
	
	public Customer saveCustomer(Customer c)
	{
		et.begin();
		em.persist(c);
		et.commit();
		return c;
	}
	 public Customer findCustomer(int id) {
	        Customer customer = em.find(Customer.class,id);
	        return customer;
	    }
	 
	 public Customer deleteCustomer(int id) {
	        Customer cus1 = em.find(Customer.class, id);
	        if (cus1 != null) {
	            et.begin();
	            em.remove(cus1);
	            et.commit();
	            return cus1;
	        }
	        return null;
	    }
	 
	 public Customer updateCustomer(Customer customer, int id) {
	        Customer cus2 = em.find(Customer.class, id);
	        if (cus2 != null) {
	            customer.setId(id);
	            et.begin();
	            em.merge(customer);
	            et.commit();
	            return customer;
	        }
	        return null;
	    }
	 
	
	public List<Customer>getAllCustomer()
	{
		Query query=em.createQuery("select c from manager c");
		List<Customer>allcustomer=query.getResultList();
		if(!allcustomer.isEmpty())
		{
			return allcustomer;
		}
		else {
			return null;
		}
	}
	
	
	//Account
	
	public Account saveAccount(Account a)
	{
		et.begin();
		em.persist(a);
		et.commit();
		return a;
	}
	
	
	 public Account findAccount(int id) {
	        Account account = em.find(Account.class, id);
	        return account;
	    }
	 
	 public Account deleteAccount(int id) {
	        Account account = em.find(Account.class,id);
	        if (account != null) {
	            et.begin();
	            em.remove(account);
	            et.commit();
	            return account;
	        }
	        return null;
	    }
	 
	 public Account updateAccount(Account account, int id) {
	        Account acc1 = em.find(Account.class, id);
	        if (acc1 != null) {
	            account.setId(id);
	            et.begin();
	            em.merge(account);
	            et.commit();
	            return account;
	        }
	        return null;
	    }
	 
	
	public List<Account>getAllAccount()
	{
		Query query=em.createQuery("select a from manager a");
		List<Account>allaccount=query.getResultList();
		if(!allaccount.isEmpty())
		{
			return allaccount;
		}
		else {
			return null;
		}
	}
	
	//Transaction
	
	public Transaction savetransaction(Transaction t)
	{
		et.begin();
		em.persist(t);
		et.commit();
		return t;
	}
	
	 public Transaction findTransaction(int id) {
	        Transaction transaction = em.find(Transaction.class,id);
	        return transaction;
	    }
 
	 
	 public Transaction deleteTransaction(int id) {
	        Transaction tran1 = em.find(Transaction.class, id);
	        if (tran1 != null) {
	            et.begin();
	            em.remove(tran1);
	            et.commit();
	            return tran1;
	        }
	        return null;
	    }
	 
	 public Transaction updateTransaction(Transaction transaction, int id) {
	        Transaction tran2 = em.find(Transaction.class,id);
	        if (tran2 != null) {
	            transaction.setId(id);
	            et.begin();
	            em.merge(transaction);
	            et.commit();
	            return transaction;
	        }
	        return null;
	    }

		
	public List<Transaction>getAllTransaction()
	{
		Query query=em.createQuery("select t from manager t");
		List<Transaction>alltransaction=query.getResultList();
		if(!alltransaction.isEmpty())
		{
			return alltransaction;
		}
		else {
			return null;
		}
	}
	

}
