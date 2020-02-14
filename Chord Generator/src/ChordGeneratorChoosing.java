import java.util.Scanner;

import java.awt.image.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;

public class ChordGeneratorChoosing
	{

		static Scanner userInput = new Scanner(System.in);
		static String chosenKeySignature;
		static String chosenChordProgression;
		static int chosenKeySignatureIndex;
		static int chosenChordProgressionIndex;
		static String romanChordOne;
		static String romanChordTwo;
		static String romanChordThree;
		static String romanChordFour;
		static String romanToChordOne;
		static String romanToChordTwo;
		static String romanToChordThree;
		static String romanToChordFour;
		static String panelKeySignature;
		static String panelFinalChords;
	

		static final JFrame frame = new JFrame();

		public static void makeKeySignatureList()
			{

				String keySignatureList = "";

				for (int c = 0; c < ChordGeneratorDriver.keySignatures.size(); c++)
					{
						keySignatureList += (" (" + (c + 1) + ")   " + ChordGeneratorDriver.keySignatures.get(c).getMyKey()
								+ "\n");
					}

				panelKeySignature = JOptionPane.showInputDialog(frame,
						"Please choose a key signature below: \n" + keySignatureList);
			}

		public static void chooseKeySignature()
			{

				chosenKeySignatureIndex = Integer.parseInt(panelKeySignature) - 1;

				for (int j = 0; j < ChordGeneratorDriver.keySignatures.size(); j++)
					{

						ChordGeneratorDriver.keySignatures.get(j).setIndex(j);

						int definedKeySignatureIndex = ChordGeneratorDriver.keySignatures.get(j).getIndex();

						if (chosenKeySignatureIndex == definedKeySignatureIndex)
							{
								chosenKeySignature = ChordGeneratorDriver.keySignatures.get(j).getMyKey();

								JOptionPane.showMessageDialog(frame,
										"Okay, you chose the key of: " + chosenKeySignature);

							}
					}
			}

		public static void askIfWantInstructions2()
			{
				boolean userInputError = true;
				while (userInputError)
					{

						String wantInstructions = JOptionPane.showInputDialog(frame,
								"Would you like the instructions for chord progressions?\n(1) Yes\n(2) No");

						if (wantInstructions.equals("1") || wantInstructions.toUpperCase().equals("ONE"))
							{
								userInputError = false;
								giveChordProgressionInstructions();
							}

						else if (wantInstructions.equals("2") || wantInstructions.toUpperCase().equals("TWO"))
							{
								JOptionPane.showMessageDialog(frame,
										"Okay, great. It is now time to choose a chord progression.");
								userInputError = false;

							}

						else
							{
								System.out.println("You only have two options.");
							}
					}

			}

		public static void giveChordProgressionInstructions()
			{
				JOptionPane.showMessageDialog(frame, "Okay, here are the instructions:");

				JOptionPane.showMessageDialog(frame,
						"You will choose from a set of chord progression wich each look like this. I, II, IIIm, V.\nEach Roman Numeral represents a chord in the chosen key signature.");

				JOptionPane.showMessageDialog(frame,
						"\"m\" shows that the chord is minor.\nNo \"m\" attached to the Roman Numeral means that the chord is Major.");

				JOptionPane.showMessageDialog(frame,
						"So, this chord progression: Vm, II, III, Im =\nChord 5 minor\nChord 2 Major\nChord 3 Major\nChord 1 Minor");

				JOptionPane.showMessageDialog(frame, "Okay, now it is time to choose a chord progression.");
			}

		public static void makeChordProgressionList()
			{

				panelKeySignature = "";

				for (int i = 0; i < ChordGeneratorDriver.chordProgressions.size(); i++)
					{
						panelKeySignature += (("(" + (i + 1) + ")   " + ChordGeneratorDriver.chordProgressions.get(i)
								+ "\n"));

					}

				chosenChordProgressionIndex = Integer.parseInt(JOptionPane.showInputDialog(frame,
						"Please choose a chord progression below: \n" + panelKeySignature))-1;
			}

		public static void chooseChordProgression()
			{
				chosenChordProgression = ChordGeneratorDriver.chordProgressions.get(chosenChordProgressionIndex);

				JOptionPane.showMessageDialog(frame, "Awesome, you chose the \"" + chosenChordProgression
						+ "\" chord progression. \n" + "Now locating your chords...");

			}

		public static void grabRomanNumerals()
			{

				String romanChordOneWithSpaces = chosenChordProgression.substring(0, 8);
				romanChordOne = romanChordOneWithSpaces.trim();

				String romanChordTwoWithSpaces = chosenChordProgression.substring(8, 16);
				romanChordTwo = romanChordTwoWithSpaces.trim();

				String romanChordThreeWithSpaces = chosenChordProgression.substring(16, 24);
				romanChordThree = romanChordThreeWithSpaces.trim();

				String romanChordFourWithSpaces = chosenChordProgression.substring(24);
				romanChordFour = romanChordFourWithSpaces.trim();

			}

		public static void findChordOne()
			{

				if (romanChordOne.equals("VII"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMajor();
					}

				else if (romanChordOne.equals("VIIm"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMinor();
					}

				else if (romanChordOne.equals("VI"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMajor();
					}

				else if (romanChordOne.equals("VIm"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMinor();
					}

				else if (romanChordOne.equals("V"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMajor();
					}

				else if (romanChordOne.equals("Vm"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMinor();
					}

				else if (romanChordOne.equals("IV"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMajor();
					}

				else if (romanChordOne.equals("IVm"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMinor();
					}

				else if (romanChordOne.equals("III"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMajor();
					}

				else if (romanChordOne.equals("IIIm"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMinor();
					}

				else if (romanChordOne.equals("II"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMajor();
					}

				else if (romanChordOne.equals("IIm"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMinor();
					}

				else if (romanChordOne.equals("I"))
					{

						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMajor();
					}

				else if (romanChordOne.equals("Im"))
					{
						romanToChordOne = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMinor();
					}

			}

		public static void findChordTwo()
			{

				if (romanChordTwo.contentEquals("VII"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMajor();
					}

				if (romanChordTwo.contentEquals("VIIm"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMinor();
					}

				else if (romanChordTwo.equals("VI"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMajor();
					}

				else if (romanChordTwo.equals("VIm"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMinor();
					}

				else if (romanChordTwo.equals("V"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMajor();
					}

				else if (romanChordTwo.equals("Vm"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMinor();
					}

				else if (romanChordTwo.equals("IV"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMajor();
					}

				else if (romanChordTwo.equals("IVm"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMinor();
					}

				else if (romanChordTwo.equals("III"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMajor();
					}

				else if (romanChordTwo.equals("IIIm"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMinor();
					}

				else if (romanChordTwo.equals("II"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMajor();
					}

				else if (romanChordTwo.equals("IIm"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMinor();
					}

				else if (romanChordTwo.equals("I"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMajor();
					}

				else if (romanChordTwo.equals("Im"))
					{
						romanToChordTwo = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMinor();
					}

			}

		public static void findChordThree()
			{

				if (romanChordThree.contentEquals("VII"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMajor();
					}

				if (romanChordThree.contentEquals("VIIm"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMinor();
					}

				else if (romanChordThree.equals("VI"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMajor();
					}

				else if (romanChordThree.equals("VIm"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMinor();
					}

				else if (romanChordThree.equals("V"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMajor();
					}

				else if (romanChordThree.equals("Vm"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMinor();
					}

				else if (romanChordThree.equals("IV"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMajor();
					}

				else if (romanChordThree.equals("IVm"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMinor();
					}

				else if (romanChordThree.equals("III"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMajor();
					}

				else if (romanChordThree.equals("IIIm"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMinor();
					}

				else if (romanChordThree.equals("II"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMajor();
					}

				else if (romanChordThree.equals("IIm"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMinor();
					}

				else if (romanChordThree.equals("I"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMajor();
					}

				else if (romanChordThree.equals("Im"))
					{
						romanToChordThree = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMinor();
					}

			}

		public static void findChordFour()
			{

				if (romanChordFour.equals("VII"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMajor();
					}

				if (romanChordFour.equals("VIIm"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSevenMinor();
					}

				else if (romanChordFour.equals("VI"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMajor();
					}

				else if (romanChordFour.equals("VIm"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordSixMinor();
					}

				else if (romanChordFour.equals("V"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMajor();
					}

				else if (romanChordFour.equals("Vm"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFiveMinor();
					}

				else if (romanChordFour.equals("IV"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMajor();
					}

				else if (romanChordFour.equals("IVm"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordFourMinor();
					}

				else if (romanChordFour.equals("III"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMajor();
					}

				else if (romanChordFour.equals("IIIm"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordThreeMinor();
					}

				else if (romanChordFour.equals("II"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMajor();
					}

				else if (romanChordFour.equals("IIm"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordTwoMinor();
					}

				else if (romanChordFour.equals("I"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMajor();
					}

				else if (romanChordFour.equals("Im"))
					{
						romanToChordFour = ChordGeneratorDriver.keySignatures.get(chosenKeySignatureIndex)
								.getChordOneMinor();
					}

			}

		public static void giveChords()
			{
				

				JOptionPane.showMessageDialog(frame, "In the key of " + chosenKeySignature
						+ ", your chords for the chord progression \"" + chosenChordProgression + "\" are:\n" + "(1)   " + romanToChordOne + "\n(2)   " + romanToChordTwo + "\n(3)   "
						+ romanToChordThree + "\n(4)   " + romanToChordFour);

				int choice = Integer.parseInt(JOptionPane.showInputDialog(frame,
						"Would you like to start over with a different key signature?\n (1) Yes\n (2) No"));

				if (choice == 1)
					{
						JOptionPane.showMessageDialog(frame, "Okay, lets go.");
						boolean wantMoreChords = true;
					}

				else
					{
						JFrame image = new JFrame();

						ImageIcon pianoPicture = new ImageIcon("PianoTwo.jpg");

						
						JOptionPane.showMessageDialog(image, "Thank you, have a nice day.", null, 0, pianoPicture);
						ChordGeneratorDriver.wantMoreChords = false;
					}

			}

	}
