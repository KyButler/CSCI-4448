package main.store.customer;

public class CustomerFactory {
  public Customer getCustomer(String customerType){
    switch(customerType) {
      case "Casual": {
        return new Casual();
      }
      case "Business": {
        return new Business();
      }
      case "Catering": {
        return new Catering();
      }
      default: {
        System.out.println("Invalid Customer Type!");
        return null;
      }
    }
  }
}
