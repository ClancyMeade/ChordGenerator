import java.util.Scanner; 

public class ChordGeneratorGreetUser
	{	
		static Scanner userInput = new Scanner(System.in);
		
		public static void introduceGenerator() 
		{ 
			System.out.println("Hello, welcome to the chord generator. What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello " + name.substring(0,1).toUpperCase() + name.substring(1) + ". ");
		
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
							System.out.println("Well you must be a master.");
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
			System.out.println("Okay, here are the instructions:");
			userInput.nextLine(); 
			System.out.println("This program will generate a set of chords from a chord progression based on the key signature that you choose.");
			userInput.nextLine(); 
			System.out.println("Chords are written with an uppercase letter.\n\"M\" shows that the chord is major.\n\"m\" shows that the chord is minor.\n\"#\" shows that the chord is sharp. \n\"b\" shows that the chord is flat." );
			userInput.nextLine(); 
			System.out.println("For example, the chord F sharp major would be written as: F#M");
			userInput.nextLine(); 
			System.out.println("Okay, now you are ready.");
			
		}
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*if (name.toUpperCase().equals("RYAN"))
					{
						System.out.println("You SUCK!");
					}*/
			
			
		}
	
