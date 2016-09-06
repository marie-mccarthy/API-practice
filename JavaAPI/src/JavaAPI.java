import java.util.Scanner;

public class JavaAPI
	{
		static int vowel =1;
		public static void main(String[] args)
		{
			exercise1();
			exercise2();
	//		exercise3();
		}
		public static String exercise1()
		{
			System.out.println("input a word and I will tell you if it is plural or not");
			Scanner userInputWord= new Scanner(System.in);
			String word = userInputWord.nextLine();	
			//int lastLetter = word.length();
			//int firstLetter= word.length()-1;
			int lastLetter = word.length()-1;
		//	System.out.println(word.length());
			if(word.substring(lastLetter)==("s"))
				{
					System.out.println("plural");
				}
			else
				{
					System.out.println(" not plural");
				}
			return word;
		}
		public static String exercise2()
		{
			System.out.println("input a word");
			Scanner userInputWord2= new Scanner(System.in);
			String word2 = userInputWord2.nextLine();			
			String letters = word2.substring(0, word2.length());	
			for(int i = 0; i<word2.length();i++)
				{
			switch(letters)
			{
				case"a":						
				case"e":						
				case"i":					
				case"o":					
				case"u":
						{
							vowel++;
						}
			}
				}
			System.out.println(vowel);
			return word2;			
		}
		//public static String exercise3()
			{
				System.out.println("input your name");
				Scanner userInputWord3= new Scanner(System.in);
				String name = userInputWord3.nextLine();	
		//		return name;
				
			}
			
	}
