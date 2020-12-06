
public class StringLetterCounter {
	public static void main(String[] arg) {
		String[] phrase = {
				"A STITCH IN TIME SAVES NINE",
				"DONT EAT YELLOW SNOW",
				"JUST DO IT",
				"EVERY GOOD BOY DOSE FINE",
				"I WANT MY MTV",
				"I LIKE IKE",
				"PLAY IT GAIN SAM",
				"FROSTY THE SNOW MAN",
				"ONE MORE FOR THE ROAD",
				"HOME FIELD ADVANTAGE",
				"VALENTINES DAY NASSACRE",
				"GROVER CLEVELAND OHIO",
				"SPAGHETTI WESTERN",
				"AQUA TEEN HUNGER FORCE",
				"ITS A WONDERFUL LIFE",
				"don't eat yellow snow",
				"just do it",
				"every good boy dose fine",
				"I want my MTV",
				"I like IKE",
				"Play it again sam",
				"frosty the snow man",
				"one more for the road",
				"home field advantage",
				"valentine's day massacre",
				"grover cleveland ohio",
				"spaghetti western",
				"aqua teen hunger force",
				"its a wonderful life"
		};
		
		/* This dose not work for the lower case letters,
		 * the cap letters have a numerical value starting with 'A' = 65 and 'Z' = 90. This is 
		 * why we need to subtract off 'A' from the last print method "letterCount[count - 'A'].
		 */
		
		
		
		int[] letterCount = new int[26];
		for (int i = 0; i < phrase.length; i++) {
			String single = phrase[i];
			char[] letters = single.toCharArray();
			for (int j = 0; j < letters.length; j++) {
				char oneLetter = letters[j];
				if ((oneLetter >= 'A') & (oneLetter <= 'Z')) {
					letterCount[oneLetter - 'A']++;
				}
				
			}
				
		}
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + " : " + letterCount[count - 'A'] + ", ");
			if ( count == 'M') {
				System.out.println();
			}
			
		}
		System.out.println();
	}

}
