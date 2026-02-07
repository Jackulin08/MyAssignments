package assgn1.day1;

public class Palindrome {

public static void main(String[] args) {

    int n = 1221;   
    int original = n;
    int reverse = 0;

    for (; n > 0; n = n / 10) {
        int digit = n % 10;
        reverse = reverse * 10 + digit;
    }

    if (original == reverse) {
        System.out.println("Palindrome number");
    } else {
        System.out.println("Not a palindrome number");
    }
}
}
