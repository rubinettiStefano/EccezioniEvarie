package lezioni;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class Esempio2Propagazione
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		while(true)
		{
			try
			{
				//indovinello1();
				break;
			}
			catch (RuntimeException e)
			{
				String messaggioErrore = e.getMessage();
				System.out.println(messaggioErrore);
				System.out.println("RIPROVA");
			}
		}


		System.out.println("SONO QUI");

//		indovinello2();
		while(true)
		{
			try
			{
				indovinello2();
				break;
			}
			catch (RuntimeException e)
			{
				System.out.println("Ricomincia da capo");
			}
		}

	}

	private static void indovinello1()
	{
		System.out.println("Cosa è spesso arrabbiato e innervosito con gli altri programmatori?");
		String risposta = sc.nextLine();

		if(risposta.equals("programmatore"))
			System.out.println("BRAVO");
		else
		{
			RuntimeException bomba = new RuntimeException("INDIZIO: è nella domanda");
			 throw bomba;
		}
	}

	private static void indovinello2()
	{
		//se sbagli la prima domanda allora la ripeti
		//se sbagli la seconda ripeti tutto
		while(true)
		{
			try
			{
				domanda1();
				break;
			}
			catch (RuntimeException e)
			{
				System.out.println("RIPETI DOMANDA 1");
			}
		}

		System.out.println("Prossima domanda");
		domanda2();
	}


	private static void domanda1()
	{
		System.out.println("Quanto fa 2+2");
		int risposta = Integer.parseInt(sc.nextLine());

		if(risposta!=4)
		{
			RuntimeException exception = new RuntimeException("SBAGLIATO");
			throw exception;
		}
		else
			System.out.println("GIUSTO");
	}


	private static void domanda2()
	{

		System.out.println("Quanto fa 15+18");
		int risposta = Integer.parseInt(sc.nextLine());

		if(risposta!=33)
		{
			RuntimeException exception = new RuntimeException("SBAGLIATO, e assolutamente non fa 36");
			throw exception;
		}
		else
			System.out.println("GIUSTO");

	}


}
