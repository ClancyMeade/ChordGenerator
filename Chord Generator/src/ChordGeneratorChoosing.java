import java.util.Scanner; 

public class ChordGeneratorChoosing
	{
		static Scanner userInput = new Scanner(System.in);
		
	
		
		public static void chooseKeySignature()
		{ 
			System.out.println("Please choose a key signature below:"); 
			System.out.println("(1) CMajor \n(2) GMajor \n(3) DMajor \n(4) AMajor");
		
			
			int chosenKeySignatureIndex = userInput.nextInt(); 
			
			for (int j = 0; j < ChordGeneratorDriver.keySignatures.size(); j++)
			{  
				ChordGeneratorDriver.keySignatures.get(j).setIndex(j+1);
				
				int definedKeySignatureIndex = ChordGeneratorDriver.keySignatures.get(j).getIndex();
					
					if (chosenKeySignatureIndex == definedKeySignatureIndex)
					{ 
						userInput.nextLine(); 
						System.out.println("Okay, you chose the key of: " + ChordGeneratorDriver.keySignatures.get(j).getMyKey());
					}
			}
		}
		
		public static void chooseChordProgression()
		{ 	
			userInput.nextLine(); 
			System.out.println("Now please choose a chord progression below:"); 
			System.out.println("I, IV, V, II");
			String inputChordProgression = userInput.nextLine(); 
		}
		
		
		
	}
