public class Manipulate {
    public String trimAndConcat(String first , String second) {
        String one = first.trim();
        String two = second.trim();
        String concat = one + two;
        return concat;
    }
    public static int getIndexOrNull(String phrase, char letter) {
        String str = phrase;
            return str.indexOf(letter, 0);
    }

    public static int getIndexOrNull(String word, String substring) {
        String str = word;
            return str.indexOf(substring, 0);
    }

    public static String concatSubstring(String word1, int num1, int num2, String word2) {
        String str = word1.substring(num1,num2) + word2;
            return str;
    }
    
}