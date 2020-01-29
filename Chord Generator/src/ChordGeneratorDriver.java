import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChordGeneratorDriver
	{

		static ArrayList<keySignature> keySignatures = new ArrayList<keySignature>();

		static ArrayList<String> chordProgressions = new ArrayList<String>();

		static boolean wantMoreChords = true;

		public static void main(String[] args)
			{
				chordProgressions.add("VIm     IV      I       V");
				chordProgressions.add("I       V       VIm     IV");
				chordProgressions.add("I       IV      V       I");
				chordProgressions.add("V       VIm     IV      I");
				chordProgressions.add("IV      I       V       VIm");
				chordProgressions.add("I       VIm     IV      V");

				// C Major = no sharps or flats
				keySignatures.add(new keySignature(0, "CMajor", "CM", "Cm", "DM", "Dm", "EM", "Em", "FM", "Fm", "GM",
						"Gm", "AM", "Am", "BM", "Bm"));
				// G Major = one sharp
				keySignatures.add(new keySignature(0, "GMajor", "GM", "Gm", "AM", "Am", "BM", "Bm", "CM", "Cm", "DM",
						"Dm", "EM", "Em", "F#M", "F#m"));
				// D Major = two sharps
				keySignatures.add(new keySignature(0, "DMajor", "DM", "DM", "EM", "Em", "F#M", "F#m", "GM", "Gm", "AM",
						"Am", "BM", "Bm", "C#M", "C#m"));
				// A Major = three sharps
				keySignatures.add(new keySignature(0, "AMajor", "AM", "Am", "BM", "Bm", "C#M", "C#m", "DM", "Dm", "EM",
						"Em", "F#M", "F#m", "G#M", "G#m"));
				// E Major = four sharps
				keySignatures.add(new keySignature(0, "EMajor", "EM", "Em", "F#M", "F#m", "G#M", "G#m", "AM", "Am",
						"BM", "Bm", "C#M", "C#m", "D#M", "D#m"));
				// B Major = five sharps
				keySignatures.add(new keySignature(0, "BMajor", "BM", "Bm", "C#M", "C#m", "D#M", "D#m", "EM", "Em",
						"F#M", "F#m", "G#M", "G#m", "A#M", "A#m"));
				// F Major = one flat
				keySignatures.add(new keySignature(0, "FMajor", "FM", "Fm", "GM", "Gm", "AM", "Am", "Bb", "Bbm", "CM",
						"Cm", "DM", "Dm", "EM", "Em"));
				// B flat Major = two flats
				keySignatures.add(new keySignature(0, "BMajor", "Bb", "Bbm", "CM", "Cm", "DM", "Dm", "EbM", "Ebm", "FM",
						"Fm", "GM", "Gm", "AM", "Am"));
				// E flat Major = three flats
				keySignatures.add(new keySignature(0, "EMajor", "EbM", "Ebm", "FM", "Fm", "GM", "Gm", "AbM", "Abm",
						"BbM", "Bbm", "CM", "Cm", "DM", "Dm"));
				// A flat Major = four flats
				keySignatures.add(new keySignature(0, "AMajor", "AbM", "Abm", "BbM", "Bbm", "CM", "Cm", "DbM", "Dbm",
						"EbM", "Ebm", "FM", "Fm", "GM", "Gm"));
				// D flat Major = five flats
				keySignatures.add(new keySignature(0, "DMajor", "DbM", "Dbm", "EbM", "Ebm", "FM", "Fm", "GbM", "Gbm",
						"AbM", "Abm", "BbM", "Bbm", "CM", "Cm"));

				ChordGeneratorGreetUser.introduceGenerator();
				ChordGeneratorGreetUser.askIfWantInstructions();

				while (wantMoreChords)
					{
						ChordGeneratorChoosing.makeKeySignatureList();
						ChordGeneratorChoosing.chooseKeySignature();
						ChordGeneratorChoosing.askIfWantInstructions2();
						ChordGeneratorChoosing.makeChordProgressionList();
						ChordGeneratorChoosing.chooseChordProgression();
						ChordGeneratorChoosing.grabRomanNumerals();
						ChordGeneratorChoosing.findChordOne();
						ChordGeneratorChoosing.findChordTwo();
						ChordGeneratorChoosing.findChordThree();
						ChordGeneratorChoosing.findChordFour();
						ChordGeneratorChoosing.giveChords();

					}

			}

	}
