public class StringToChar {

    public static void main(String[] args) {

        String str = "ThisShouldBeConverted";

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }

    }
}
