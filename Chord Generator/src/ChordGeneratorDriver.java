import java.util.ArrayList;

public class ChordGeneratorDriver
	{
		static ArrayList <keySignature> keySignatures = new ArrayList <keySignature>();

		static ArrayList <String> chordProgressions = new ArrayList <String>(); 
		
		public static void main(String[] args)
			{
				chordProgressions.add("VIm     IV      I       V"); 
				chordProgressions.add("I       V       VIm     IV"); 
				chordProgressions.add("I       IV      V       I");
			
				//C Major = no sharps or flats
				keySignatures.add(new keySignature (0, "CMajor", "CM", "Cm", "DM", "Dm","EM", "Em", "FM", "Fm","GM", "Gm", "AM", "Am","BM", "Bm")); 
				//G Major = one sharp
				keySignatures.add(new keySignature (0, "GMajor", "GM", "Gm", "AM", "Am", "BM", "Bm", "CM", "Cm", "DM", "Dm", "EM", "Em", "F#M", "F#m")); 
				//D Major = two sharps 
				keySignatures.add(new keySignature (0, "DMajor", "DM", "dM", "EM", "Em","F#M", "F#m", "GM", "Gm","AM", "Am", "BM", "Bm","C#M", "C#m"));
				//A Major = three sharps 
				keySignatures.add(new keySignature (0, "AMajor", "AM", "Am", "BM", "Bm", "C#M", "C#m", "DM", "Dm", "EM", "Em", "F#M", "F#m", "G#M", "G#m"));
				
				
				
				 
				
				
			
				
				ChordGeneratorGreetUser.introduceGenerator(); 
				ChordGeneratorGreetUser.askIfWantInstructions();
				ChordGeneratorChoosing.makeKeySignatureList(); 
				ChordGeneratorChoosing.chooseKeySignature();
				ChordGeneratorChoosing.askIfWantInstructions2();
				ChordGeneratorChoosing.makeChordProgressionList(); 
				ChordGeneratorChoosing.chooseChordProgression(); 


				
			}

	}
