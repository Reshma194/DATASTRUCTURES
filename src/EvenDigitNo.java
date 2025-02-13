import java.util.*;

public class EvenDigitNo {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    // Function to count numbers with even digits
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) { // Check if the number has an even number of digits
                count++;
            }
        }
        return count;
    }

    // Function to check if a number has an even number of digits
    public static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // Function to count digits in a number
    public static int digits(int num) {
        int count = 0;
        if (num == 0) return 1; // Edge case for 0
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
