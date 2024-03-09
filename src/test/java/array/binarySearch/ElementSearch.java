package array.binarySearch;

public class ElementSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 11, 12, 15};
        int key = 10;
        System.out.println(bS(arr, key));
    }

    public static int bS(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // Corrected calculation of mid

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
