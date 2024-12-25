package week_11;

public class StringReversal {

    public static void main(String[] args) {
        char[] testArray = {'h', 'e', 'l', 'l', 'o'};
        reverseString(testArray);
        System.out.println(testArray);
    }

    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
