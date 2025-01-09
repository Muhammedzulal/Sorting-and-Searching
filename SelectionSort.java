package SortingSearching;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 3, 7, 1, -2, 0 };

        // ^Before
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        selectionSort(arr);

        // ^After
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // En küçük elemanın indeksi
            int minIndex = i;

            // Kalan dizide en küçük elemanı bul
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // En küçük elemanı ile yer değiştir
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
    }
    // 4 3 2 1
    // 1 3 2 4
    // 1 2 3 4
}
