package lezioni;

import java.awt.*;
import java.util.Scanner;

public class Esempio1
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{



		//CODICE CALDO
		//CODICE CHE PUÒ GENERARE ECCEZIONE
		try
		{
			System.out.println("Dammi primo numero");
			String s = sc.nextLine();
			int a = Integer.parseInt(s);
			System.out.println("Dammi secondo numero");
			String s1 = sc.nextLine();
			int b = Integer.parseInt(s1);

			System.out.println("La somma è "+(a+b));
		}
		catch (Exception e)
		{
			System.out.println("BUFFONE,DAMMI NUMERO");
			System.exit(-1);
		}



	}
}
