package SortingSearching;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 3, 7, 1, -2, 0 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Merge Sort'un ana metodu
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Diziyi ortadan ikiye bölmek için orta noktayı bul
            int mid = left + (right - left) / 2;

            // Sol yarıyı sıralar
            mergeSort(array, left, mid);

            // Sağ yarıyı sıralar
            mergeSort(array, mid + 1, right);

            // İki yarıyı birleştirir
            merge(array, left, mid, right);
        }
    }

    // İki alt diziyi birleştirme metodu
    private static void merge(int[] array, int left, int mid, int right) {
        // Alt dizilerin boyutlarını belirle
        int n1 = mid - left + 1; // Sol alt dizi
        int n2 = right - mid; // Sağ alt dizi

        // Geçici alt diziler oluştur
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Verileri alt dizilere kopyala
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Alt dizileri birleştirme işlemi
        int i = 0, j = 0;
        int k = left; // Ana dizideki başlangıç indeksi

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Sol alt dizide kalan elemanları kopyala
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Sağ alt dizide kalan elemanları kopyala
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
