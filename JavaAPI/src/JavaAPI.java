import java.util.Scanner;

public class JavaAPI
	{
		static int vowel =1;
		public static void main(String[] args)
		{
			exercise1();
			exercise2();
			exercise3();
		}
		public static String exercise1()
		{
			System.out.println("input a word and I will tell you if it is plural or not");
			Scanner userInputWord= new Scanner(System.in);
			String word = userInputWord.nextLine();	
			int lastLetter = word.length()-1;
		
			String last = word.substring(lastLetter,word.length());
			if( word.substring(lastLetter,word.length()).equals("s"))
				{
					System.out.println("plural");
				}
			else
				{
					System.out.println("not plural");
				}
			return word;
		}
		public static String exercise2()
		{
			int sum = 0;
			System.out.println("input a word");
			Scanner userInputWord2= new Scanner(System.in);						
			String word = userInputWord2.nextLine();			
			for(int i = 0; i<word.length();i++)
			{
				switch(word.substring(i,i+1))
							{
								case"a":
								case"e":
								case"i":
								case"o":
								case"u":								
										{					
											int vowelIndex =(word.indexOf(word.substring(i,i+1)));
											sum+=vowelIndex;
										}													
							}					
			}
			System.out.println(sum);
			
			return word;
		}
		public static String exercise3()
			{
			System.out.println("input your full name");
			Scanner userInputWord2= new Scanner(System.in);
			char vowel = 0;
			String name = userInputWord2.nextLine();			
			String letters2 = name.substring(0, name.length());
			
			for(int i = 0; i<name.length();i++)
			{
				if(name.substring(i,i+1).equals("a")||name.substring(i,i+1).equals("e")||name.substring(i,i+1).equals("i")||name.substring(i,i+1).equals("o")||name.substring(i,i+1).equals("o"))
				{
				
					vowel = name.charAt(i);
				}
				else
				{
					
				}				
			}				
			int last=1;
			System.out.println(name.lastIndexOf(vowel));
			return letters2;				
			}			
	}
