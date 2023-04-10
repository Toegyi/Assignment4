package problem1;

public class Problem1 {
    public static void main(String[] args) {
        reverseDigits(1234);
    }
    public static void reverseDigits(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverseDigits(n / 10);
        }
    }
}
// 1234---> 1234> 10 and go to else case
// print 4 and recursively call reverseDigits(1234/10)
// 123> 10 and go to else case
// print 3 and recursively call reverseDigits(123/10)
// 12---> 12> 10 and go to else case
// print 2 and recursively call reverseDigits(12/10)
// 1---> 1< 10
// So, print 1.