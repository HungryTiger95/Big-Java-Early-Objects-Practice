import java.util.Scanner;

/**
 * P5.7
 * 
 * French country names are feminine when they end with the letter e, masculine otherwise,
 * except for the following which are masculine even though they end with e:
 * 
 * 		*le Belize
 * 		*le Cambodge
 * 		*le Mexique
 * 		*le Mozambique
 * 		*le Zaire
 * 		*le Zimbabwe
 * 
 * Write a program that reads the French name of a country and adds the article: le for
 * masculine or la for feminine, such as le Canada or la Belgique.
 * 
 * However, if the country name starts with a vowel, use l'; for example, l'Afganistan.
 * For the following plural country names, use les:
 * 
 * 		*les Etats-Unis
 * 		*les Pays-Bas
 * 
 * @author Mayuresh
 *
 */
public class FrenchNames
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Country Name: ");
		String countryName = in.nextLine();
		
		in.close();
		
		if(countryName.equals("Etats-Unis") || countryName.equals("Pays-Bas"))
		{
			System.out.println("les " + countryName);
		}
		else if(countryName.equals("Belize") || countryName.equals("Cambodge") || countryName.equals("Mexique") ||
				countryName.equals("Mozambique") || countryName.equals("Zaire") || countryName.equals("Zimbabwe"))
		{
			System.out.println("le " + countryName);
		}
		else if(countryName.startsWith("A") || countryName.startsWith("E") ||
				countryName.startsWith("I") || countryName.startsWith("O") || countryName.startsWith("U"))
		{
			System.out.println("l'" + countryName);
		}
		else if(countryName.endsWith("e"))
		{
			System.out.println("la " + countryName);
		}
		else
		{
			System.out.println("le " + countryName);
		}
	}
}
