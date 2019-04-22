package section_05;

import java.util.Stack;

public class StackDemo
{
	public static void main(String[] args)
	{
		Stack<String> commands = new Stack<String>();
		commands.push("Insert 'Hello'");
		commands.push("Insert ','");
		commands.push("Insert ' '");
		commands.push("Insert 'World'");
		commands.push("Insert '?'");
		commands.push("Delete '?'");
		commands.push("Insert '!'");
		
		// Now we undo the last four commands
		for(int i = 0; i < 4; i++)
		{
			String command = commands.pop();
			System.out.println("Undo: " + command);
		}
	}
}
