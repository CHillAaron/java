public class ManipulationTest {
    public static void main(String[] args) {
        Manipulate manipulator = new Manipulate();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 

        // char letter = 'o';
        // Integer a = Manipulate.getIndexOrNull("Coding", letter);
        // Integer b = Manipulate.getIndexOrNull("Hello World", letter);
        // Integer c = Manipulate.getIndexOrNull("Hi", letter);
        // System.out.println(a); // 1
        // System.out.println(b); // 4
        // System.out.println(c); // null

        // String word = "Hello";
        // String subString = "llo";
        // String notSubString = "world";
        // Integer a = manipulator.getIndexOrNull(word, subString);
        // Integer b = manipulator.getIndexOrNull(word, notSubString);
        // System.out.println(a); // 2
        // System.out.println(b); // null

        String word = Manipulate.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld

    }
}