/**
 * P3.8
 * 
 * Implement a VotingMachine class that can be used for a simple election. Have methods
 * to clear the machine state, to vote for a Democrat, to wote for a Republican, and to get
 * the tallies for both parties.
 * 
 * @author Mayuresh
 *
 */

public class VotingMachine
{
	// Instance Variables
	private int democratVotes;
	private int republicanVotes;

	// Constructors
	/**
	 * Creates a VotingMachine object with initialized 0 votes
	 */
	public VotingMachine()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}
	// Methods
	/**
	 * Casts a vote for the Democrats
	 */
	public void voteDemocrat()
	{
		democratVotes++;
	}
	
	/**
	 * Casts a vote for the Republicans
	 */
	public void voteRepublican()
	{
		republicanVotes++;
	}
	
	/**
	 * Gets the number of votes for Republicans
	 * @return number of votes for Republicans
	 */
	public int getRepublicanVotes()
	{
		return republicanVotes;
	}
	
	/**
	 * Gets the number of votes for Democrats
	 * @return number of votes for Democrats
	 */
	public int getDemocratVotes()
	{
		return democratVotes;
	}
	
	/**
	 * Clears the number of votes for both parties
	 */
	public void clear()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}
	
	/**
	 * Gets the winner of the election
	 * @return winner
	 */
	public String getWinner()
	{
		if(getDemocratVotes() > getRepublicanVotes())
		{
			return "Democrats Win!";
		}
		else if(getRepublicanVotes() > getDemocratVotes())
		{
			return "Republicans Win!";
		}
		else
		{
			return "Its a Tie!";
		}
	}
}
