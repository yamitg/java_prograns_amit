package practice_package_java;

public class palindrome_second {
    public static void main(String[] args)
    {
        int n = 500;
        System.out.print("Palindrome numbers up to 500: ");
        for (int i = 2; i <= n; i++) {
            int c = i;
            int rev = 0;
            int rem;
            while (c > 0) {
                rem = c % 10;
                rev = rev * 10 + rem;
                c = c / 10;
            }
            if (i == rev) {
                System.out.print(i + ", ");
            }
        }


    }
}
