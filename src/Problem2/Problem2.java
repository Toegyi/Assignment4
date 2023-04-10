package Problem2;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(countDigits(10000000));
    }

    public static int countDigits(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
// countDigits(10000000) and call countDigits
// 10000000 > 10 and go to the else state
// 1 + countDigits(1000000)--->7
// 1 + countDigits(100000)-->6
// 1 + countDigits(10000)-->5
// 1 + countDigits(1000)-->4
// 1 + countDigits(100)-->3
// 1 + countDigits(10)-->2
// 1 + countDigits(1)--->1

// So,the ans will be (1+7).