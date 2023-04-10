package problem3;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sum(arr, arr.length);
        System.out.println(sum);
    }

    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return arr[n-1] + sum(arr, n-1);
        }
    }
}

// call the sum(arr, 5)
// 5 is not equal to 0 and go to the else state
// arr[4] + sum (arr, n-1)-->5
// arr[3] + sum (arr, n-1)-->4
// arr[2] + sum (arr, n-1)-->3
// arr[1] + sum (arr, n-1)-->2
// arr[0] + sum (arr, n-1)--> 1
// So the total will be 15.