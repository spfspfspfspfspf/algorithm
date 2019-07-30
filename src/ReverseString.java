public class ReverseString {
    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', '0', 'h'};
        int length = chars.length;
        int halfLength = chars.length / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = temp;
        }
        System.out.println(chars);
    }
}