public class Main {
    public static void main(String ... arg) {
        String sequence = "";
        int vowels = 0;
        int consonant = 0;
        for (int i = 0 ; i < sequence.length() ; ++i) {
            char c = sequence.charAt(i);
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
               vowels++;
            } else {
                consonant++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonant);
    }
}
