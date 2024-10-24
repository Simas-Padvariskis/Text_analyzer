public class Text_analyzer {
//==================================================
    public static int word_count (String text){ //Apskaiciuoja zodziu skaiciu
        int count = 0;
        if (text.isEmpty() == false) {
           count = 1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ')
                    count++;
            }
        }
        return count;
    }
//==================================================
    public static int char_count (String text){ //Apskaiciuoja simboliu skaiciu
        int count = 0;
        if (text.isEmpty()  == false) {
                count = text.length();
            }
        return count;
    }
//==================================================
    public static char most_char (String text){
        char max_char = ' ';
        int [] freq = new int[text.length()];
        if (text.isEmpty()  == false) {
            for (int i = 0; i < text.length(); i++) {
                freq[i] = 1;
                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j) && text.charAt(i) != ' ') {
                        freq[i]++;
                    }
                }
            }
            int maxx = freq[0];
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > maxx) {
                    maxx = freq[i];
                    max_char = text.charAt(i);
                }
            }
        }
        return max_char;
    }
//==================================================
    public static StringBuilder reverse_text (String text){ //Sukuria atvirkstini teksta
        StringBuilder reverseText = new StringBuilder(text);
        reverseText.reverse();
        return reverseText;
    }
//==================================================
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Number of wrods: " + word_count(text));
        System.out.println("Number of characters (space included): " + char_count(text));
        System.out.println("Most occuring character: " + most_char(text));
        System.out.println("Reversed string: " + reverse_text(text));
    }
}
//--------------------------------------------------
