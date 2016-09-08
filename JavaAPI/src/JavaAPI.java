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
		;
			String last = word.substring(lastLetter,word.length());
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
			char vowel1 = 0;
			char vowel2 = 0;
			char vowel3 = 0;
			char vowel4 = 0;
			char vowel5 = 0;			
			String word = userInputWord2.nextLine();			
			String letters2 = word.substring(0, word.length());			
			for(int i = 1; i<word.length();i++)
			{
				if(word.substring(i,i+1).equals("a"))
				{				
					vowel1 = word.charAt(i);
				}
				if(word.substring(i,i+1).equals("e"))
				{
					vowel2 = word.charAt(i);
				}
				if(word.substring(i,i+1).equals("i"))
				{
					vowel3 = word.charAt(i);
				}				
				if(word.substring(i,i+1).equals("o"))
				{
					vowel4 = word.charAt(i);
				}				
				if(word.substring(i,i+1).equals("u"))
				{
					vowel5 = word.charAt(i);
				}
				else
				{
					
				}
							
			}
			int v1 = (word.indexOf(vowel1));
			int v2 = (word.indexOf(vowel2));
			int v3 = (word.indexOf(vowel3));
			int v4 = (word.indexOf(vowel2));
			int v5 = (word.indexOf(vowel3));
			System.out.println("Vowel 1+"+v1);
			System.out.println("Vowel 2+"+v2);
			System.out.println("Vowel 3+"+v3);
			System.out.println("Vowel 4+"+v4);
			System.out.println("Vowel 5+"+v5);
			
			
			//System.out.println(sum);
			return word;
		}
		public static String exercise3()
			{
			System.out.println("input your full name");
			Scanner userInputWord2= new Scanner(System.in);
			//find first vowel
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
