import java.util.Scanner;

public class Main {
    public static void main(String[] args) { }

    // task 1
    public static void print1ToN(int n) {
        if (n == 0) return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    // task 2
    public static void printNTo1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    // task 3
    public static int sumN(int n) {
        if (n == 0) return 0;
        return n + sumN(n - 1);
    }

    // task 4
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // task 5
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    // task 6
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    // task 7
    public static int countDigits(int n) {
        if (n < 10) return 1;
        return 1 + countDigits(n / 10);
    }

    // task 8
    public static int reverseNumber(int n, int rev) {
        if (n == 0) return rev;
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    // task 9
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // task 10
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    // task 11
    public static int arraySum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + arraySum(arr, n - 1);
    }

    // task 12
    public static int arrayMax(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.max(arr[n - 1], arrayMax(arr, n - 1));
    }

    // task 13
    public static int countOccurrences(int[] arr, int n, int target) {
        if (n == 0) return 0;
        return (arr[n - 1] == target ? 1 : 0)
                + countOccurrences(arr, n - 1, target);
    }

    // task 14
    public static boolean linearSearch(int[] arr, int n, int target) {
        if (n == 0) return false;
        if (arr[n - 1] == target) return true;
        return linearSearch(arr, n - 1, target);
    }

    // task 15
    public static boolean isSorted(int[] arr, int n) {
        if (n == 1) return true;
        if (arr[n - 2] > arr[n - 1]) return false;
        return isSorted(arr, n - 1);
    }

    // task 16
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, right, target);
    }
}