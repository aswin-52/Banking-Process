package BankProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contollers 
{
	Scanner sc=new Scanner(System.in);
	
	Bank_Dao dao=new Bank_Dao();
	
	 public void saveBank() {
	        Bank bank = new Bank();
	        System.out.println("Enter bank name:");
	        bank.setB_name(sc.next());
	        System.out.println("Enter bank IFSC:");
	        bank.setIFSC(sc.nextLong());
	        System.out.println("Enter bank city:");
	        bank.setCity(sc.next());
	        System.out.println("Enter bank contact number:");
	        bank.setCont(sc.nextLong());

	        // Assuming you have a method to save a manager for the bank
	        System.out.println("Enter manager details for the bank:");
	        Manager manager = new Manager();
	        System.out.println("Enter manager name:");
	        manager.setName(sc.next());
	        System.out.println("Enter manager city:");
	        manager.setM_city(sc.next());
	        System.out.println("Enter manager contact number:");
	        manager.setCont(sc.nextLong());
	        bank.setManager(manager);
	        manager.setBank(bank);

	        if (dao.saveBank(bank) != null) {
	            System.err.println("Bank saved successfully");
	        } else {
	            System.err.println("---------Failure--------");
	        }
	    }
	
	 public void findAllBanks() {
	        List<Bank> allBanks = dao.getAllBanks();
	        for (Bank bank : allBanks) {
	            System.out.println(bank.getId() + " " + bank.getB_name() + " " + bank.getCity()+" "+bank.getCont());
	        }
	    }
	 
	   public void findBank() {
	        System.out.println("Enter bank ID:");
	        int id = sc.nextInt();
	        Bank bank = dao.findBank(id);
	        if (bank != null) {
	            System.out.println(bank.getId() + " " + bank.getB_name() + " " + bank.getCity()+" "+bank.getCont());
	        } else {
	            System.err.println("---------Failure--------");
	        }
	    }

	   
	   public void updateBank() {
	        System.out.println("Enter bank ID:");
	        int id = sc.nextInt();
	        Bank bank = dao.findBank(id);
	        if (bank != null) {
	            System.out.println("1: Update name");
	            System.out.println("2: Update IFSC");
	            System.out.println("3: Update city");
	            System.out.println("4: Update contact");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter new name:");
	                    bank.setB_name(sc.next());
	                    break;
	                case 2:
	                    System.out.println("Enter new IFSC:");
	                    bank.setIFSC(sc.nextLong());
	                    break;
	                case 3:
	                    System.out.println("Enter new city:");
	                    bank.setCity(sc.next());
	                    break;
	                case 4:
	                    System.out.println("Enter new contact:");
	                    bank.setCont(sc.nextLong());
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    return;
	            }
	            dao.updateBank(bank, id);
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	   
	   public void deleteBank() {
	        System.out.println("Enter bank ID:");
	        int id = sc.nextInt();
	        if (dao.deleteBank(id) != null) {
	            System.out.println("Bank deleted successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	   
	   
	   //Customer
	   
	   
	   public void saveCustomer() {
	        Customer customer = new Customer();
	        System.out.println("Enter customer name:");
	        customer.setName(sc.next());
	        System.out.println("Enter customer city:");
	        customer.setC_city(sc.next());
	        System.out.println("Enter customer contact number:");
	        customer.setContact(sc.nextLong());

	        
	        System.out.println("Enter account details for the customer:");
	        Account account = new Account();
	        System.out.println("Enter account type:");
	        account.setType(sc.next());
	        System.out.println("Enter account balance:");
	        account.setBalance(sc.nextDouble());
	        System.out.println("Enter account number:");
	        account.setNumber(sc.nextLong());
	        customer.setAccount(account);
	        account.setCustomer(customer);

	        if (dao.saveCustomer(customer) != null) {
	            System.out.println("Customer saved successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	   
	   public void findAllCustomers() {
	        List<Customer> allCustomers = dao.getAllCustomer();
	        for (Customer customer : allCustomers) {
	            System.out.println(customer.getId() + " " + customer.getName() + " " + customer.getC_city());
	        }
	    }
	   
	   public void findCustomer() {
	        System.out.println("Enter customer ID:");
	        int id = sc.nextInt();
	        Customer customer = dao.findCustomer(id);
	        if (customer != null) {
	            System.out.println(customer.getId() + " " + customer.getName() + " " + customer.getC_city());
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	   
	   
	   public void updateCustomer() {
	        System.out.println("Enter customer ID:");
	        int id = sc.nextInt();
	        Customer customer = dao.findCustomer(id);
	        if (customer != null) {
	            System.out.println("1: Update name");
	            System.out.println("2: Update city");
	            System.out.println("3: Update contact");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter new name:");
	                    customer.setName(sc.next());
	                    break;
	                case 2:
	                    System.out.println("Enter new city:");
	                    customer.setC_city(sc.next());
	                    break;
	                case 3:
	                    System.out.println("Enter new contact:");
	                    customer.setContact(sc.nextLong());
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    return;
	            }
	            dao.updateCustomer(customer, id);
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void deleteCustomer() {
	        System.out.println("Enter customer ID:");
	        int id = sc.nextInt();
	        if (dao.deleteCustomer(id) != null) {
	            System.out.println("Customer deleted successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    
	    //manager
	    
	    public void saveManager() {
	        Manager manager = new Manager();
	        System.out.println("Enter manager name:");
	        manager.setName(sc.next());
	        System.out.println("Enter manager city:");
	        manager.setM_city(sc.next());
	        System.out.println("Enter manager contact number:");
	        manager.setCont(sc.nextLong());

	        
	        System.out.println("Enter the bank ID to which the manager belongs:");
	        int bankId = sc.nextInt();
	        Bank bank = dao.findBank(bankId);
	        manager.setBank(bank);

	        if (dao.saveManager(manager) != null) {
	            System.out.println("Manager saved successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void findAllManagers() {
	        List<Manager> allManagers = dao.getAllManages();
	        for (Manager manager : allManagers) {
	            System.out.println(manager.getId() + " " + manager.getName() + " " + manager.getM_city());
	        }
	    }
	    
	    public void findManager() {
	        System.out.println("Enter manager ID:");
	        int id = sc.nextInt();
	        Manager manager = dao.findManager(id);
	        if (manager != null) {
	            System.out.println(manager.getId() + " " + manager.getName() + " " + manager.getM_city());
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    
	    public void updateManager() {
	        System.out.println("Enter manager ID:");
	        int id = sc.nextInt();
	        Manager manager = dao.findManager(id);
	        if (manager != null) {
	            System.out.println("1: Update name");
	            System.out.println("2: Update city");
	            System.out.println("3: Update contact");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter new name:");
	                    manager.setName(sc.next());
	                    break;
	                case 2:
	                    System.out.println("Enter new city:");
	                    manager.setM_city(sc.next());
	                    break;
	                case 3:
	                    System.out.println("Enter new contact:");
	                    manager.setCont(sc.nextLong());
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    return;
	            }
	            dao.updateManager(manager, id);
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void deleteManager() {
	        System.out.println("Enter manager ID:");
	        int id = sc.nextInt();
	        if (dao.deleteManager(id) != null) {
	            System.out.println("Manager deleted successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }


	//Account
	    
	    public void saveAccount() {
	        Account account = new Account();
	        System.out.println("Enter account type:");
	        account.setType(sc.next());
	        System.out.println("Enter account balance:");
	        account.setBalance(sc.nextDouble());
	        System.out.println("Enter account number:");
	        account.setNumber(sc.nextLong());

	        
	        System.out.println("Enter the customer ID to which the account belongs:");
	        int customerId = sc.nextInt();
	        Customer customer = dao.findCustomer(customerId);
	        account.setCustomer(customer);

	        if (dao.saveAccount(account) != null) {
	            System.out.println("Account saved successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void findAllAccounts() {
	        List<Account> allAccounts = dao.getAllAccount();
	        for (Account account : allAccounts) {
	            System.out.println(account.getId() + " " + account.getType() + " " + account.getBalance());
	        }
	    }
      
	    
	    public void findAccount() {
	        System.out.println("Enter account ID:");
	        int id = sc.nextInt();
	        Account account =dao.findAccount(id);
	        if (account != null) {
	            System.out.println(account.getId() + " " + account.getType() + " " + account.getBalance());
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void updateAccount() {
	        System.out.println("Enter account ID:");
	        int id = sc.nextInt();
	        Account account = dao.findAccount(id);
	        if (account != null) {
	            System.out.println("1: Update account type");
	            System.out.println("2: Update account balance");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter new account type:");
	                    account.setType(sc.next());
	                    break;
	                case 2:
	                    System.out.println("Enter new account balance:");
	                    account.setBalance(sc.nextDouble());
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    return;
	            }
	            dao.updateAccount(account, id);
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void deleteAccount() {
	        System.out.println("Enter account ID:");
	        int id = sc.nextInt();
	        if (dao.deleteAccount(id) != null) {
	            System.out.println("Account deleted successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
   	    }
	    //Transaction
	    
	    public void saveTransaction() {
	        Transaction transaction = new Transaction();
	        System.out.println("Enter transaction type:");
	        transaction.setType(sc.next());
	        System.out.println("Enter transaction amount:");
	        transaction.setTr_amount(sc.nextDouble());
	        System.out.println("Enter transaction status:");
	        transaction.setStatus(sc.next());
	        System.out.println("Enter customer ID:");
	        transaction.setUsr_id(sc.nextInt());

	        if (dao.savetransaction(transaction) != null) {
	            System.out.println("Transaction saved successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void findAllTransactions() {
	        List<Transaction> allTransactions = dao.getAllTransaction();
	        for (Transaction transaction : allTransactions) {
	            System.out.println(transaction);
	        }
	    }
	    
	    public void findTransaction() {
	        System.out.println("Enter transaction ID:");
	        int id = sc.nextInt();
	        Transaction transaction =dao.findTransaction(id);
	        if (transaction != null) {
	            System.out.println(transaction);
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void updateTransaction() {
	        System.out.println("Enter transaction ID:");
	        int id = sc.nextInt();
	        Transaction transaction = dao.findTransaction(id);
	        if (transaction != null) {
	            System.out.println("1: Update transaction type");
	            System.out.println("2: Update transaction amount");
	            System.out.println("3: Update transaction status");
	            System.out.println("4: Update customer ID");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter new transaction type:");
	                    transaction.setType(sc.next());
	                    break;
	                case 2:
	                    System.out.println("Enter new transaction amount:");
	                    transaction.setTr_amount(sc.nextDouble());
	                    break;
	                case 3:
	                    System.out.println("Enter new transaction status:");
	                    transaction.setStatus(sc.next());
	                    break;
	                case 4:
	                    System.out.println("Enter new customer ID:");
	                    transaction.setUsr_id(sc.nextInt());
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    return;
	            }
	            dao.updateTransaction(transaction, id);
	        } else {
	            System.out.println("---------Failure--------");
	        }
	    }
	    
	    public void deleteTransaction() {
	        System.out.println("Enter transaction ID:");
	        int id = sc.nextInt();
	        if (dao.deleteTransaction(id) != null) {
	            System.out.println("Transaction deleted successfully");
	        } else {
	            System.out.println("---------Failure--------");
	        }

	    }
}
