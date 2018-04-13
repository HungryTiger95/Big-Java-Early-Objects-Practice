import java.util.Random;
import java.util.Scanner;

public class VotingMachineSimulator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		VotingMachine voter = new VotingMachine();
		
		int demVote = generator.nextInt(5000) + 1;
		int repVote = generator.nextInt(5000) + 1;
		
		for(int i = 0; i < demVote; i++)
		{
			voter.voteDemocrat();
		}
		
		for(int j = 0; j < repVote; j++)
		{
			voter.voteRepublican();
		}
		
		System.out.println("Republican Votes: " + voter.getRepublicanVotes());
		System.out.println("Democrat Votes:   " + voter.getDemocratVotes());
		System.out.println(voter.getWinner());
		
		voter.clear();
		
		System.out.println("After Clearing:");
		System.out.println("Republican Votes: " + voter.getRepublicanVotes());
		System.out.println("Democrat Votes: " + voter.getDemocratVotes());
	}

}
