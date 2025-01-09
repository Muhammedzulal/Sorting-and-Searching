package SortingSearching;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 3, 7, 1, -2, 0 };

        // ^Before
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        insertionSort(arr);

        // ^After
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Sıralı kısmın içine doğru iterasyon yap
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println();
    }
    // 4 3 2 1
    // 4 4 2 1
    // 3 4 2 1
    // 3 4 4 1
    // 3 3 4 1
    // 2 3 4 1
    // 2 3 4 4
    // 2 3 3 4
    // 2 2 3 4
    // 1 2 3 4
}
