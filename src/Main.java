public class Main {
    public static void main(String[] args) {
        String t = "Anna";
        isPalindrome(t);
    }

    public static String reverseString(String t) {
        String r = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            r += t.charAt(i);
        }
        return r;
    }

    public static boolean isPalindrome(String t) {
        if (t.equalsIgnoreCase(reverseString(t))) {
            System.out.println(t + " is palindrome");
        } else {
            System.out.println(t + " is nit palindrome");
        }
        return t.equalsIgnoreCase(reverseString(t));
    }

}
