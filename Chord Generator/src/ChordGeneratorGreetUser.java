import java.util.Scanner;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.image.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class ChordGeneratorGreetUser
	{
		static Scanner userInput = new Scanner(System.in);

		static final JFrame frame = new JFrame();

		public static void introduceGenerator()
			{
				UIManager.put("OptionPane.background", Color.cyan);
				UIManager.put("Panel.background", Color.DARK_GRAY);
				UIManager.put("Button.background", Color.green);
				UIManager.put("OptionPane.messageForeground", Color.cyan);

				JFrame image = new JFrame();

				ImageIcon pianoPicture = new ImageIcon("Piano.jpg");

				JOptionPane.showMessageDialog(image, "Hello, welcome to the Chord Generator", null, 0, pianoPicture);

				String name = JOptionPane.showInputDialog(frame, "What is your name?");

				JOptionPane.showMessageDialog(null,
						"Hello " + name.substring(0, 1).toUpperCase() + name.substring(1) + ". ");

			}

		public static void askIfWantInstructions()
			{
				boolean userInputError = true;
				while (userInputError)
					{
						// ystem.out.println("Would you like the instructions?\n (1) Yes\n (2) No");

						String wantInstructions = JOptionPane.showInputDialog(frame,
								"Would you like the instructions?\n (1) Yes\n (2) No");

						if (wantInstructions.equals("1") || wantInstructions.toUpperCase().equals("ONE")
								|| wantInstructions.toUpperCase().equals("YES"))
							{
								userInputError = false;
								giveInstructions();
							}

						else if (wantInstructions.equals("2") || wantInstructions.toUpperCase().equals("TWO")
								|| wantInstructions.toUpperCase().equals("NO"))
							{
								JOptionPane.showMessageDialog(frame, "Well you must be a master.");
								userInputError = false;

							}

						else
							{
								JOptionPane.showMessageDialog(frame, "You only have two options.");
							}
					}
			}

		public static void giveInstructions()
			{
				JOptionPane.showMessageDialog(frame, "Okay, here are the instructions:");

				JOptionPane.showMessageDialog(frame,
						"This program will generate a set of chords from a chord progression based on the key signature that you choose.");

				JOptionPane.showMessageDialog(frame,
						"Chords are written with an uppercase letter.\n\"M\" shows that the chord is major.\n\"m\" shows that the chord is minor.\n\"#\" shows that the chord is sharp. \n\"b\" shows that the chord is flat.");

				JOptionPane.showMessageDialog(frame, "For example, the chord F sharp major would be written as: F#M");

				JOptionPane.showMessageDialog(frame, "Okay, now you are ready.");
			}

	}
