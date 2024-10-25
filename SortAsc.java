public class SortAsc {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {5, 2, 8, 7, 1};
        int temp;

        // Display elements of the original array
        System.out.println("Elements of the original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(); // New line
        // Display elements of the array after sorting
        System.out.println("Elements of the array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}