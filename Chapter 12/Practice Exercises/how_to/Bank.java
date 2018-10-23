package how_to;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   A bank contains customers.
   
   This class is a great example of aggregation. It holds and remembers an array of
   customer objects. The Bank knows about the customers but the customers don't know
   about the bank. Thus, in this case, the customers can't choose which bank they want
   to create bank accounts in.
   
   We can make this example more specific. This is also an example of composition because
   if the customer class ceases to exist, this class becomes obsolete. It can't be used as is.
   
   Furthermore, this class indirectly knows about the BankAccount class through the customer
   class.
   
   The responsibilities of this class include, reading a file containing information on customers
   in the form of:
   
   		customerNumber customerPIN
   		
   and adding customers to the bank. Also, this class is responsible for finding a customer in the bank
   based on the customers number and pin. This method uses the method in the customer class called match
   and returns the customer if there is a customer with that number and pin, else it will return a
   null Customer object.
   
*/
public class Bank
{  
   private ArrayList<Customer> customers;

   /**
      Constructs a bank with no customers.
   */
   public Bank()
   {  
      customers = new ArrayList<Customer>();
   }
   
   /**
      Reads the customer numbers and pins.
      @param filename the name of the customer file
   */
   public void readCustomers(String filename) throws IOException
   {  
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext())
      {  
         int number = in.nextInt();
         int pin = in.nextInt();
         Customer c = new Customer(number, pin);
         addCustomer(c);
      }
      in.close();
   }
   
   /**
      Adds a customer to the bank.
      @param c the customer to add
   */
   public void addCustomer(Customer c)
   {  
      customers.add(c);
   }
   
   /** 
      Finds a customer in the bank.
      @param aNumber a customer number
      @param aPin a personal identification number
      @return the matching customer, or null if no customer 
      matches
   */
   public Customer findCustomer(int aNumber, int aPin)
   {  
      for (Customer c : customers)
      {  
         if (c.match(aNumber, aPin))
         {
            return c;
         }
      }
      return null;
   }
}


