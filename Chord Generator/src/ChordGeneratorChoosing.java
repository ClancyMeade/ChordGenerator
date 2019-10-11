import java.util.Scanner;

public class ChordGeneratorChoosing {
	static Scanner userInput = new Scanner(System.in);

	
	static int ChosenChordProgression = 0; 
	static int ChosenKeySignature = 0; 
	
	
	public static void makeKeySignatureList() {
		System.out.println("Please choose a key signature below:");

		for (int c = 0; c < ChordGeneratorDriver.keySignatures.size(); c++) {
			System.out.println("(" + (c + 1) + ") " + ChordGeneratorDriver.keySignatures.get(c).getMyKey());

		}

		
	}
	
	public static void chooseKeySignature()
	{ 
		int chosenKeySignatureIndex = userInput.nextInt();

		for (int j = 0; j < ChordGeneratorDriver.keySignatures.size(); j++) {
			
			ChordGeneratorDriver.keySignatures.get(j).setIndex(j + 1);

			int definedKeySignatureIndex = ChordGeneratorDriver.keySignatures.get(j).getIndex();

			if (chosenKeySignatureIndex == definedKeySignatureIndex) {
				userInput.nextLine();
				System.out.println("Okay, you chose the key of: " + ChordGeneratorDriver.keySignatures.get(j).getMyKey());
				userInput.nextLine();
				
			
			}
		}
	}

	
	
	
	
	public static void askIfWantInstructions2() {
		boolean userInputError = true;
		while (userInputError) {

			System.out.println("Would you like the instructions for chord progressions?\n(1) Yes\n(2) No");
			String wantInstructions = userInput.nextLine();

			if (wantInstructions.equals("1") || wantInstructions.toUpperCase().equals("ONE")) {
				userInputError = false;
				giveChordProgressionInstructions();
			}

			else if (wantInstructions.equals("2") || wantInstructions.toUpperCase().equals("TWO")) {
				System.out.println("Okay, great. It is now time to choose a chord progression.");
				userInput.nextLine();
				userInputError = false;

			}

			else {
				System.out.println("You only have two options.");
			}
		}

	}

	
	
	
	
	public static void giveChordProgressionInstructions() {
		System.out.println("Okay, here are the instructions:");
		userInput.nextLine();
		System.out.println(
				"You will choose from a set of chord progression wich each look like this. I, II, IIIm, V#.\nEach Roman Numeral represents a chord in the chosen key signature.");
		userInput.nextLine();
		System.out.println(
				"\"m\" shows that the chord is minor.\n\"# \" shows that the chord is sharp.\n\"b\" shows that the chord is flat.\nNo \"m\" attached to the Roman Numeral means that the chord is Major.");
		userInput.nextLine();
		System.out.println(
				"So, this chord progression: Vm, II, IIIb, I# =\nChord 5 minor\nChord 2 Major\nChord 3 Flat\nChord 1 Sharp");
		userInput.nextLine();
		System.out.println("Okay, now it is time to choose a chord progression.");
	}
	
	
	
	

	public static void makeChordProgressionList() {
		System.out.println("Please Choose a chord progression below, type in your choice below.");

		for (int i = 0; i < ChordGeneratorDriver.chordProgressions.size(); i++) {
			System.out.println("(" + (i) + ") " + ChordGeneratorDriver.chordProgressions.get(i));
			System.out.println();

		}
	}
	
	
	
	public static void chooseChordProgression() 
	{ 
		int chosenChordProgressionIndex = userInput.nextInt(); 
		String chosenChordProgression = ChordGeneratorDriver.chordProgressions.get(chosenChordProgressionIndex); 
		userInput.nextLine(); 
		System.out.println("Awesome, you chose the \"" + chosenChordProgression + "\" chord progression.");
		userInput.nextLine(); 
		System.out.println("Now locating your chords...");
		userInput.nextLine(); 
		System.out.println("Your chords are:");
		
		
		String romanChordOne = chosenChordProgression.substring(0,8); 
		String romanChordTwo = chosenChordProgression.substring(8,16); 
		String romanChordThree = chosenChordProgression.substring(16,24); 
		String romanChordFour = chosenChordProgression.substring(24); 
		System.out.println(romanChordOne);
		System.out.println(romanChordTwo);
		System.out.println(romanChordThree);
		System.out.println(romanChordFour);
		
		/*int number = 0; 
		int [] decimal = {1, 2, 3, 4, 5, 6, 7}; 
		String [] roman = {"I", "II", "III", "IV", "V", "VI", "VII"}; 
		
		String test = "I"; 
		 
		for (int i = 0; i < decimal.length; i++)
		{ 
			while(test.indexOf(roman[i]) == 0)
					{ 
					number += decimal [i]; 
					test = test.substring(roman[i].length()); 
					
					}
		
		}
		*/

		
		
		//converting Roman numerals 
		
	
		
		
		
		

		
		
		
			
		
		
		}
	
	
	
	
		
	
		
		
	
	}



