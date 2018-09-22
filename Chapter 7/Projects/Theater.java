
public class Theater
{
	// Instance Variables
	private int[][] theaterSeats = {
			 {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			 {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			 {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
			 {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			 {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			 {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
			 {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
			 {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
			 {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
	};
	private int i;
	private int j;
	
	// Constructors
	
	// Methods
	/**
	 * Sets index i value
	 * @param i i
	 */
	public void setI(int i)
	{
		this.i = i;
	}
	
	/**
	 * Sets index j value
	 * @param j j
	 */
	public void setJ(int j)
	{
		this.j = j;
	}
	
	/**
	 * Clears the values for i and j by setting both values to 100
	 */
	public void clearIJ()
	{
		this.i = 100;
		this.j = 100;
	}
	/**
	 * Checks if the seat is available
	 * @param i i
	 * @param j j
	 * @return true if seat is available, else false
	 */
	public boolean isSeatAvailable(int i, int j)
	{
		if(theaterSeats[i][j] == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	/**
	 * Checks if the seat is available based on seat price
	 * @param price price
	 * @return if seat is available
	 */
	public boolean isSeatAvailable(int price)
	{
		boolean avail = false;
		
		outerloop:
		for(int i = 0; i < theaterSeats.length; i++)
		{
			for(int j = 0; j < theaterSeats.length + 1; j++)
			{
				if(theaterSeats[i][j] == price)
				{
					avail = true;
					setI(i);
					setJ(j);
					
					break outerloop;
				}
			}
		}
		
		return avail;
	}
	
	/**
	 * Purchases a seat based on given seat number
	 * @param i i
	 * @param j j
	 */
	public void purchaseSeat(int i, int j)
	{
		if(isSeatAvailable(i, j))
		{
			theaterSeats[i][j] = 0;
			
			System.out.println("Seat Bought");
		}
		else
		{
			System.out.println("Seat Unvailable");
		}
	}
	
	/**
	 * Purchases a seat based on seat price
	 * @param seatValue seat price
	 */
	public void purchaseSeat(int seatValue)
	{
		if(isSeatAvailable(seatValue))
		{
			theaterSeats[this.i][this.j] = 0;
			clearIJ();
			
			System.out.println("Seat Bought");
		}
		else
		{
			System.out.println("Seat Unavailable");
		}
	}
	
	/**
	 * Prints the seats of the theater
	 */
	public void printTheater()
	{
		System.out.println("=========================\nCurrent Theater Seating\n=========================\n");
		
		for(int i = 0; i < theaterSeats.length; i++)
		{
			for(int j = 0; j < theaterSeats.length + 1; j++)
			{
				System.out.print(theaterSeats[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
