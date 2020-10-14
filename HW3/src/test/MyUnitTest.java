package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import main.store.*;
import main.store.inventory.*;
import main.store.transactions.*;
import main.store.customer.*;
import main.store.price.*;

public class MyUnitTest {
   @Test
	
   public void testIdAssignment() {
      Store temp = new Store(7217, 30);
      assertEquals(temp.getId(), 7217);
      System.out.println("Store instantiation and id getting tested and functional!");
   }

   @Test
   public void itemConsume() {
      Item temp = new Item("test", 2.0, 1.0);
      temp.consumeStock(1.0);
      
      assertEquals(temp.getQuantity(), 1.0, 0.1);
      System.out.println("Item consuming tested and functional!");
   }

   @Test
   public void itemAdd() {
      Item temp = new Item("test", 2.0, 1.0);
      temp.addStock(1.0);
      
      assertEquals(temp.getQuantity(), 3.0, 0.1);
      System.out.println("Item addition tested and functional!");
   }

   @Test
   public void transactionWorks() {
      List<List<String>> tempListListString = new ArrayList<List<String>>();
      List<String> tempListString = new ArrayList<String>();
      tempListString.add("t1");
      tempListString.add("t2");
      List<String> tempListStringTwo = new ArrayList<String>();
      tempListString.add("t3");
      tempListString.add("t4");
      tempListListString.add(tempListString);
      tempListListString.add(tempListStringTwo);

      Transaction temp = new Transaction (0, tempListListString, "FAKE", 400.00);

      assertEquals(tempListListString, temp.getItems());
      System.out.println("Transaction instantiation tested and functional!");
   }

   @Test
   public void customerFactoryBusiness() {
      CustomerFactory tempCustomerFactory = new CustomerFactory();
      
      assertTrue(tempCustomerFactory.getCustomer("Business") instanceof Business);
      System.out.println("Customer Factory Business tested and functional!");
   }

   @Test
   public void customerFactoryCasual() {
      CustomerFactory tempCustomerFactory = new CustomerFactory();
      
      assertTrue(tempCustomerFactory.getCustomer("Casual") instanceof Casual);
      System.out.println("Customer Factory Casual tested and functional!");
   }

   @Test
   public void customerFactoryCatering() {
      CustomerFactory tempCustomerFactory = new CustomerFactory();
      
      assertTrue(tempCustomerFactory.getCustomer("Catering") instanceof Catering);
      System.out.println("Customer Factory Catering tested and functional!");
   }

   @Test
   public void priceFillingsDecorator() {
      PriceInterface testRoll = new FillingPriceDecorator(new Price());
      assertTrue(testRoll.getPrice(0.00) <= 0.75 );
      System.out.println("Fillings Decorator tested and functional!");
   }

   @Test
   public void priceToppingsDecorator() {
      PriceInterface testRoll = new ToppingsPriceDecorator(new Price());
      assertTrue(testRoll.getPrice(0.00) <= 0.50 );
      System.out.println("Toppings Decorator tested and functional!");
   }

   @Test
   public void priceSauceDecorator() {
      PriceInterface testRoll = new SaucePriceDecorator(new Price());
      assertTrue(testRoll.getPrice(0.00) <= 1.50 );
      System.out.println("Sauce Decorator tested and functional!");
   }
}