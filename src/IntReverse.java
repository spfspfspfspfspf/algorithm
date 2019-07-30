public class IntReverse {
    public static void main(String[] args) {
        System.out.println(reverse(1223));
    }

    private static int reverse(int n) {
        int result = 0;
        int temp = n;
        int mod = 0;
        while (temp != 0) {
            mod = temp % 10;
            temp = temp / 10;
            result = result * 10 + mod;
        }
        return result;
    }
}
