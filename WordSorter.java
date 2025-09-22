public class WordSorter {

    public static void main(String[] args) {

        // Step 1: The soliloquy text
        String text = "To be or not to be, that is the question;"
                + " Whether 'tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Step 2: Clean the text
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Step 3: Split  words using regex
        String[] words = text.split("\\s+");

        // Step 4: Bubble sort
        for (int pass = 0; pass < words.length - 1; pass++) {
            for (int i = 0; i < words.length - 1 - pass; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    // Swap words[i] and words[i + 1]
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                }
            }
        }

        // Step 5: Print sorted words
        System.out.println("Words in alphabetical order:");
        for (String w : words){
            System.out.println(w);
        } 
     }
}