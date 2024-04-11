package StringCompression;

public class StringCompression {

    public static void main(String[] args) {
        String input = "aaabbbcc";
        String output = compress(input);
        System.out.println(output); // a3b3c2
    }

    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }
}