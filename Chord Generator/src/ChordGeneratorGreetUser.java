import java.util.Scanner; 

public class ChordGeneratorGreetUser
	{	
		static Scanner userInput = new Scanner(System.in);
		
		public static void introduceGenerator() 
		{ 
			System.out.println("Hello, welcome to the chord generator. What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello " + name.substring(0,1).toUpperCase() + name.substring(1) + ". " + "(Press enter to continue)");
			userInput.nextLine(); 
		}
		
		public static void askIfWantInstructions()
		{
			boolean userInputError = true;
			while (userInputError)
				{

					System.out.println("Would you like the instructions?\n (1) Yes\n (2) No");
					String wantInstructions = userInput.nextLine();

					if (wantInstructions.equals("1") || wantInstructions.toUpperCase().equals("ONE"))
						{
							userInputError = false;
							giveInstructions(); 
						}

					else if (wantInstructions.equals("2") || wantInstructions.toUpperCase().equals("TWO"))
						{
							System.out.println("Ok, well you must be a master. Lets play. ");
							userInputError = false;
						}

					else
						{
							System.out.println("You only have two options.");
						}
				}	
		} 
		
		public static void giveInstructions() 
		{ 
			System.out.println("Okay, here are the rules:");
		}
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*if (name.toUpperCase().equals("RYAN"))
					{
						System.out.println("You SUCK!");
					}*/
			
			
		}
	
