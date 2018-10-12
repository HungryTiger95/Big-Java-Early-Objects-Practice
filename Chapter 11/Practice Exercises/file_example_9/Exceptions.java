package file_example_9;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * There are two aspects to dealing with program errors: detection and handling.
 * 
 * In Java, exception handling provides a flexible mechanism for passing control from the point
 * of error detection to a handler that can deal with the error.
 * 
 * When you detect an error condition, you throw and appropriate exception object. Suppose you try:
 * 
 * 		if(amount > balance)
 * 		{
 * 			// Now what?
 * 		}
 * 
 * First look for an appropriate exception class.
 * 
 * Use the throw <<--- syntax to indicate the creation of a an exception object
 * 
 * When you throw an exception, execution does not continue with the next statement but with
 * an exception handler.
 * 
 * Every exception should be handled somewhere in your program. if an exception has no handler,
 * and error messages is printed, and your program terminates.
 * 
 * You handle exceptions with the try/catch statement.
 * 		- The try block contains one or more statements that may cause an exception of the kind
 * 			that you are willing to handle.
 * 		- Each catch clause contains the handler for an exception type
 * 
 * In a try clause, if an exception is thrown then the rest of the instructions in the block are skipped.
 * Each catch clause contains a handler. 
 * 
 * In Java, the exceptions that you can throw and catch fall into three categories:
 * 		1) Internal errors are reported by descendants of the type Error. These are fatal errors
 * 			that happen rarely, and will not be considered for this tutorial
 * 
 * 		2) Descendants of RuntimeException indicate errors in your code. These are called unchecked exceptions.
 * 
 * 		3) All other exceptions are checked exceptions. These exceptions indicate that something has gone
 * 			wrong for some external reason beyond your control.
 * 
 * Occasionally, you need to take some action whether or not an exception is thrown. The finally clause
 * is used to handle this situation. For example, it is important to close a PrintWriter to ensure that
 * all output is written to the file. Suppose that one of the methods in the try statement throws an
 * exception. Then the call to close is never executed. Using the call to close inside a finally clause.
 * Whether or not an exception is thrown, the finally clause will execute.
 * 
 * 
 * 
 * ==================================================
 * Programming Tip 11.1: Throw Early, Catch Late
 * ==================================================
 * When a method detects a problem that it cannot solve, it is better to throw an exception rather than try to come
 * up with an imperfect fix.
 * 
 * For example, suppose a method expects you to read a number from a file, and the file doesn't contain a number.
 * Simply using a zero value would be a poor choice because it hides the actual problem and perhaps causes a different
 * problem elsewhere.
 * 
 * Conversely, a method should only cath an exception if it can really remedy the situation. Otherwise, the best remedy
 * is simply to have the exception propagate to its caller, allowing it to be caught by a competent handler.
 * 
 * "Throw an exception as soon as a problem is detected. Catch it only when the problem can be handled"
 * 
 * 
 * 
 * 
 * ==================================================
 * Programming Tip 11.2: Do Not Squelch Exceptions
 * ==================================================
 * When you call a method that throws a checked exception and you haven't specified a handler, the compiler complains.
 * In your eagerness to continue your work, it is an understandable impulse to shut the compiler up by squelching the
 * exception:
 * 
 * 		try
 * 		{
 * 			Scanner in = new Scanner(new File(filename));
 * 			// Compiler complains about FileNotFoundException
 * 		}
 * 		catch(FileNotFoundException e) {}
 * 
 * The do-nothing exception handler fools the compiler into thinking that the exception has been handled. In the long
 * run, this is clearly a bad idea.
 * 
 * 
 * Tl;dr: Install competent handlers, do-nothing handlers shut the compiler up, but doesn't really manage the problem.
 * 
 * 
 * 
 * 
 * ============================================================================
 * Programming Tip 11.3: Do Not Use catch and finally in the same try Statement
 * ============================================================================
 * 
 * It is possible to have a finally clause following one or more catch clauses. Then the code in the finally clause if executed
 * whenever the try block is exited in any of three ways:
 * 
 * 		1) After completing the last statement of the try block
 * 
 * 		2) After completing the last statement of a catch clause, if this try block caught an exception
 * 
 * 		3) When an exception was thrown in the try block and not caught
 * 
 * It is tempting to combine catch and finally clauses, but the resulting code can be hard to understand, and
 * it is often incorrect. Instead, ue two statements:
 * 
 * 		- A try/finally statement to close resources
 * 		
 * 		- A separate try/catch statement to handle errors
 * 
 * For example:
 * 
 * 		try
 * 		{
 * 			try
 * 			{
 * 				Write output
 * 			}
 * 			finally
 * 			{
 * 				out.close();
 * 			}
 * 		}
 * 		catch (IOException e)
 * 		{
 * 			Handle exception
 * 		}
 * 
 * 
 * 
 * 
 * 
 * ==================================================
 * Special Topic 11.5: Assertions
 * ==================================================
 * An assertion is a condition that you believe to be true at all times in a particular program location.
 * An assertion check tests whether an assertion is true. Here is a typical assertion check:
 * 
 * 		public double deposit(double amount)
 * 		{
 * 			assert amount >= 0;
 * 			balance = balance + amount;
 * 		}
 * 
 * In this method, the programmer expects that the quantity amount can never be negative. When the assertion is correct,
 * no harm is done, and the program works in the normal way. If, for some reason, the assertion fails, and assertion checking
 * is enabled, then the assert statement throws an exception of type AssertionError, causing the program to terminate.
 * 
 * However, if assertion checking is disabled, then the assertion is never checked, and the program runs at full speed.
 * Turn on assertion checking using java -enableassertions MainClass. Or use java -ea MainClass. You should use assertion
 * checking during program development and testing.
 * 
 * @author Mayuresh
 *
 */
public class Exceptions
{
	public static void main(String[] args)
	{
		String inputValues = "two 42 43 three 44 ";
		
		/**
		 * This scanner reads input from the string
		 */
	    Scanner in = new Scanner(inputValues);
	    
	    /**
	     * Boolean to control the while loop
	     */
	    boolean done = false;
	    while (!done)
	    {
	       /**
	        * Tries these instructions and then catches the specified exceptions that may occur. The last
	        * exception, "NoSuchElementException" is thrown when there are no more inputs. In this example,
	        * it signals the loop to stop.
	        */
	       try
	       {
	    	  // Reads the next integer and if it is 42, it will throw an IllegalArgumentException with a message showing "Ugh! 42
	          int n = in.nextInt();
	          System.out.println("Read integer " + n);
	          if (n == 42)
	          {
	        	  throw new IllegalArgumentException("Ugh! 42");
	          }
	          
	          // Reads the next string in the input
	          String str = in.next();
	          System.out.println("Read string " + str);
	          
	          // Parses the string to an integer
	          n = Integer.parseInt(str);
	          System.out.println("Parsed integer " + n);	
	       }
	       catch (NumberFormatException ex)
	       {
	          System.out.println(ex.getMessage());
	       }
	       catch (IllegalArgumentException ex)
	       {
	          System.out.println(ex.getMessage());
	       }
	       catch (InputMismatchException ex) 
	       {
	          // We "fix" the problem by removing the offending input
	          System.out.println("Removing " + in.next()); 
	       }
	       catch (NoSuchElementException ex) // This happens at the end of the input
	       {
	          ex.printStackTrace();
	          System.out.println("Terminating the loop.");
	          done = true;
	       }
	    }
	}
}
