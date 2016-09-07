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
		;
		//	String last = word.substring(lastLetter,word.length());
			if( word.substring(lastLetter,word.length())==("s"))
				{
					System.out.println("not plural");
				}
			else
				{
					System.out.println("plural");
				}
			return word;
		}
		public static String exercise2()
		{
			System.out.println("input a word");
			Scanner userInputWord2= new Scanner(System.in);
			String word2 = userInputWord2.nextLine();			
			String letters = word2.substring(0, word2.length());
			
			for(int i = 1; i<word2.length();i++)
			{
				if((letters == "a")||(letters == "e")||(letters == "i")||(letters == "o")||(letters == "u"))
				{
					vowel++;
				}
					
			}			
			System.out.println(vowel+" vowel");
			return word2;			
		}
		public static String exercise3()
			{
			System.out.println("input your full name");
			Scanner userInputWord2= new Scanner(System.in);
			String name = userInputWord2.nextLine();			
			String letters2 = name.substring(0, name.length());
			
			for(int i = 1; i<name.length();i++)
			{
				if(letters2 == "a")
				{
					System.out.println("a".substring());
				}
				if(letters2 == "e")
				{
					System.out.println("");
				}
				if(letters2 == "i")
				{
					System.out.println("");
				}
				if(letters2 == "o")
				{
					System.out.println("");
				}
				if(letters2 == "u")
				{
					System.out.println("");
				}
				else 
				{
					System.out.println("Your name has no vowels");
				}
			}							
			return letters2;	
				
			}
			
	}
