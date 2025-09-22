public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0,
        vowels = 0,
        letters = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Count spaces
            if (c == ' ') {
                spaces++;
            }

            // Count vowels (case-insensitive)
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels++;
            }

            // Count letters
            if (Character.isLetter(c)) {
                letters++;
            }
        }

        int consonants = letters - vowels;

        System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + consonants + "\n"
                + "spaces: " + spaces);
    }
}
