package main.store.transactions;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
  private int day;
  private List<List<String>> items = new ArrayList<List<String>>();
  private String customerType;
  private double price;

  public Transaction (int day, List<List<String>> items, String customerType, double price){
    this.day = day;
    this.items = items;
    this.customerType = customerType;
    this.price = price;
  }

  public int getDay() {
    return day;
  }

  public List<String> getItems() {
    for (List<String> roll : items){
      return roll;
    }
    return null;
  }

  public String getCustomerType() {
    return customerType;
  }

  public double getPrice() {
    return price;
  }

}
