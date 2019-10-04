import java.util.Scanner; 

public class ChordGeneratorGreetUser
	{	
		static Scanner userInput = new Scanner(System.in);
		
		public static void introduceGenerator() 
		{ 
			System.out.println("Hello, what is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello " + name);
			
		}
	}
