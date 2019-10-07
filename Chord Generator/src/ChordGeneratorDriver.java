import java.util.ArrayList;

public class ChordGeneratorDriver
	{
		static ArrayList <keySignature> keySignatures = new ArrayList <keySignature>();

		public static void main(String[] args)
			{
				
				keySignatures.add(new keySignature ("a", "b", "c", "d","a", "b", "c", "d","a", "b", "c", "d","a", "a")); 
				
				ChordGeneratorGreetUser.introduceGenerator(); 
				
				
			}

	}
