package main.store.transactions;

import java.util.ArrayList;
import java.util.List;

public class TransactionLog {
  private List<Transaction> transactions = new ArrayList<Transaction>();
  private List<Event> events = new ArrayList<Event>();

  public void addTransaction(Transaction transaction) {
    transactions.add(transaction);
  }
  
  public void printAllTransactions(){
    for (Transaction transaction : transactions ) {
      System.out.println("Day " + transaction.getDay());
      System.out.println("Items Sold " + transaction.getItems());
      System.out.println("Price of Transaction " + transaction.getPrice());
      System.out.println("Customer Type " + transaction.getCustomerType());
    }
  }
}
