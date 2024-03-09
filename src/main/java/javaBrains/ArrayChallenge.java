package javaBrains;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: create an Array of Integers
        int[] nums = {10, 20, 30, 15, 17, 45};
        int sum = 0; // Declare variables separately
        double avg = 0; // Declare variables separately
        int largest = nums[0];

        // use Array and array Operation to find the sum, average, and the largest number in an Array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        avg = (double) sum / nums.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("largest = " + largest);
    }
}
