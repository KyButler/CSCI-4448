package main.store.transactions;

import java.util.ArrayList;
import java.util.List;

public class TransactionLog {
  private List<Transaction> transactions = new ArrayList<Transaction>();
  private List<Event> events = new ArrayList<Event>();

  public void addTransaction(Transaction transaction) {
    transactions.add(transaction);
  }

  public void addEvent(Event event) {
    events.add(event);
  }

  public void printAllTransactions() {
    for (Transaction transaction : transactions) {
      System.out.println("Day " + transaction.getDay());
      System.out.println("Items Sold " + transaction.getItems());
      System.out.println("Price of Transaction $" + transaction.getPrice());
      System.out.println("Customer Type " + transaction.getCustomerType());
    }
  }

  public void printDay(int day) {
    int x = 1;
    for (Transaction transaction : transactions) {
      if (transaction.getDay() == day) {
        System.out.println("ORDER " + x);
        System.out.println("Items Sold: " + transaction.getItems());
        System.out.println("Price of Transaction: $" + transaction.getPrice());
        System.out.println("Customer Type: " + transaction.getCustomerType());
        x++;
      }
    }
  }

  public void printIncomeByCustomerType(int day) {
    List<String> customerTypes = new ArrayList<String>();
    List<Double> customerCounts = new ArrayList<Double>();

    for (Transaction transaction : transactions) {
      if (transaction.getDay() == day) {
        if (customerTypes.size() == 0) {
          customerTypes.add(transaction.getCustomerType());
          customerCounts.add(transaction.getPrice());
        } else {
          boolean found = false;
          for (int i = 0; i < customerTypes.size(); i++) {

            if (transaction.getCustomerType() == customerTypes.get(i)) {
              customerCounts.set(i, customerCounts.get(i) + transaction.getPrice());
              found = true;
            }
          }
          if (!found) {
            customerTypes.add(transaction.getCustomerType());
            customerCounts.add(transaction.getPrice());
          }
        }
      }
    }

    for (int i = 0; i < customerTypes.size(); i++) {
      System.out
          .println(customerTypes.get(i) + ": $" + customerCounts.get(i) + (i == customerTypes.size() - 1 ? "" : ", "));
    }

    if (customerTypes.size() == 0) {
      System.out.println("None!");
    }
  }

  public void printIncomeOverall(int day) {
    double totalIncome = 0;

    for (Transaction transaction : transactions) {
      if (transaction.getDay() == day) {
        totalIncome += transaction.getPrice();
      }
    }

    System.out.println("The total income for day " + day + " was $" + totalIncome + ".");
  }

  public void printRollOutages(int day) {
    List<String> customerTypes = new ArrayList<String>();
    List<Integer> failureCounts = new ArrayList<Integer>();

    for (Event event : events) {
      if (event.getDay() == day) {
        if (event.getEvent() == "unsatisfied") {
          boolean found = false;
          for (int i = 0; i < customerTypes.size(); i++) {
            if (customerTypes.get(i) == event.getAffected()) {
              failureCounts.set(i, failureCounts.get(i) + 1);
              found = true;
            }
          }
          if (!found) {
            customerTypes.add(event.getAffected());
            failureCounts.add(1);
          }
        }
      }
    }

    for (int i = 0; i < customerTypes.size(); i++) {
      System.out
          .println(customerTypes.get(i) + ": " + failureCounts.get(i) + (i == customerTypes.size() - 1 ? "" : ", "));
    }

    if (customerTypes.size() == 0) {
      System.out.println("None!");
    }
  }

  public void printRollSales(int day) {
    List<String> rollTypes = new ArrayList<String>();
    List<Double> rollSales = new ArrayList<Double>();

    for (Transaction transaction : transactions) {
      if (transaction.getDay() == day) {
        for (List<String> transactionItem : transaction.getItems()) {
          boolean found = false;
          for (int i = 0; i < rollTypes.size(); i++) {
            if (rollTypes.get(i) == transactionItem.get(0)) {
              rollSales.set(i, rollSales.get(i) + 1.0);
              found = true;
            }
          }
          if (!found) {
            rollTypes.add(transactionItem.get(0));
            rollSales.add(1.0);
          }
        }
      }
    }

    for (int i = 0; i < rollTypes.size(); i++) {
      System.out.println(rollTypes.get(i) + ": " + rollSales.get(i) + (i == rollTypes.size() - 1 ? "" : ", "));
    }

    if (rollTypes.size() == 0) {
      System.out.println("None!");
    }
  }

  public void printEndSummary() {
    // total number of rolls sold by type and overall
    List<String> rollTypes = new ArrayList<String>();
    List<Double> rollSales = new ArrayList<Double>();

    for (Transaction transaction : transactions) {
      for (List<String> transactionItem : transaction.getItems()) {
        boolean found = false;
        for (int i = 0; i < rollTypes.size(); i++) {
          if (rollTypes.get(i) == transactionItem.get(0)) {
            rollSales.set(i, rollSales.get(i) + 1.0);
            found = true;
          }
        }
        if (!found) {
          rollTypes.add(transactionItem.get(0));
          rollSales.add(1.0);
        }
      }
    }
    System.out.println("ALL DAYS SUMMARY");
    System.out.println("\n");
    System.out.println("TOTAL ROLLS SOLD OVER ALL THE DAYS");

    for (int i = 0; i < rollTypes.size(); i++) {
      System.out.println(rollTypes.get(i) + ": " + rollSales.get(i) + (i == rollTypes.size() - 1 ? "" : ", "));
    }

    if (rollTypes.size() == 0) {
      System.out.println("None!");
    }

    System.out.println("\n");
    // total money in sales

    double totalIncome = 0;

    for (Transaction transaction : transactions) {
      totalIncome += transaction.getPrice();
    }

    System.out.println("TOTAL INCOME OVER ALL OF THE DAYS");
    System.out.println("$" + totalIncome);
    System.out.println("\n");
    // total number of roll outage impacts.

    int outageImpacts = 0;

    for (Event event : events) {
      if (event.getEvent() == "unsatisfied") {
        outageImpacts += 1;
      }
    }

    System.out.println("TOTAL NUMBER OF ROLL OUTAGE IMPACTS");

    System.out.println(outageImpacts);
  }
}
