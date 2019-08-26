package exercise_06;

/**
 * An interface type is used to specify required operations. The interface declaration lists
 * all methods that the interface type requires. An interface type is similar to a class,
 * but there are several important differences:
 * 
 * 		- An interface type does not have instance variables
 * 		
 * 		- All methods in an interface type are abstract; that is, they have a name,
 * 		  parameters, and a return type, but they don't have an implementation
 * 		
 * 		- All methods in an interface type are automatically public
 * 		
 * 		- An interface type has no constructor. Interfaces are not classes, and
 * 		  you cannot construct objects of an interface type
 * 
 * 
 * @author Mayuresh
 *
 */
public interface Measurable
{
	double getMeasure();
}
