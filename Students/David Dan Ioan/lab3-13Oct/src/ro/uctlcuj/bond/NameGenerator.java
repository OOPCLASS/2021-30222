package ro.uctlcuj.bond;
import java.util.Random;

/**
 * Got it from gitHub because I thought it would be fun to have but I'm to lazy to make it myself
 * LordAmit/NameGenerator.java
 * 
 * @author amit
 *
 */
public class NameGenerator {
	private static final int diffBetweenAtoZ = 25;
	private static final int charValueOfa = 97;
	private String lastGeneratedName = "";
	int length;
	Random randomNumberGenerator = new Random();

	char[] vowels = {
			'a', 'e', 'i', 'o', 'u'
	};

	public NameGenerator(int lengthOfName) {
		if (lengthOfName < 3 || lengthOfName > 15) {
			System.out.println("Setting default length to 7");
			lengthOfName = 7;
		}

		this.length = lengthOfName;
	}
	
	public NameGenerator() {
		this.length = randomNumberGenerator.nextInt(7)+3;
	}

	public String getName() {
		for (;;) {
			Random randomNumberGenerator = new Random();
			char[] nameInCharArray = new char[length];
			for (int i = 0; i < length; i++) {
				if (positionIsOdd(i)) 
					nameInCharArray[i] = getVowel(randomNumberGenerator);
				else 
					nameInCharArray[i] = getConsonant(randomNumberGenerator);
			}
			nameInCharArray[0] = (char) Character.toUpperCase(nameInCharArray[0]);
			
			String currentGeneratedName = new String(nameInCharArray);
			
			if (!currentGeneratedName.equals(lastGeneratedName)) {
				lastGeneratedName = currentGeneratedName;
				return currentGeneratedName;
			}			
		}
	}

	private boolean positionIsOdd(int i) {
		return i % 2 == 0;
	}

	private char getConsonant(Random randomNumberGenerator) {
		for (;;) {
			char currentCharacter = (char) (randomNumberGenerator
					.nextInt(diffBetweenAtoZ) + charValueOfa);
			if (currentCharacter == 'a' || currentCharacter == 'e'
					|| currentCharacter == 'i' || currentCharacter == 'o'
					|| currentCharacter == 'u')
				continue;
			else
				return currentCharacter;
		}
	}

	private char getVowel(Random randomNumberGenerator) {
		return vowels[randomNumberGenerator.nextInt(vowels.length)];
	}
}