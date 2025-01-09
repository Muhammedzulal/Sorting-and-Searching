package SortingSearching;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 3, 7, 1, -2, 0 };

        // ^Before
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        bubbleSort(arr);

        // ^After
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // n-i-1 olma sebebi her iç döngü bittiğinde solda en büyük oluyor
            // sağdan itibaren(büyükten) tek tek sıralanıyor
            for (int j = 0; j < n - 1 - i; j++) { // Komşu elemanları karşılaştır
                if (arr[j] > arr[j + 1]) { // Büyük olanı sağa taşı
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }
    // --> 4 3 2 1()
    // --> 3 4 2 1()
    // --> 3 2 4 1()
    // --> 3 2 1 4()
    // --> 2 3 1 (4)
    // --> 2 1 (3 4)
    // --> 1 (2 3 4)
    // --> (1 2 3 4)
}
