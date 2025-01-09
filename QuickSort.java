package SortingSearching;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 7, 1, -2, 0 };

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // QuickSort ana metodu
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Pivotu bul ve pivotun doğru pozisyonunda olduğundan emin ol
            int pivotIndex = partition(array, low, high);

            // Pivotun sol kısmını sırala
            quickSort(array, low, pivotIndex - 1);

            // Pivotun sağ kısmını sırala
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Dizi bölme (partition) işlemi
    public static int partition(int[] array, int low, int high) {
        // Orta elemanı pivot olarak seç
        int mid = low + (high - low) / 2;
        int pivot = array[mid];

        int i = low; // Sol taraf için gösterge
        int j = high; // Sağ taraf için gösterge

        while (i <= j) {
            // Pivotdan küçük veya eşit elemanlar için sol tarafı genişlet
            while (array[i] < pivot) {
                i++;
            }

            // Pivotdan büyük elemanlar için sağ tarafı daralt
            while (array[j] > pivot) {
                j--;
            }

            // Eğer i ve j hala geçerli bir bölme noktasıysa, elemanları takas et
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        // Bölme işlemi tamamlandı, pivotun yeni pozisyonunu döndür
        return i - 1;
    }

    // İki elemanı takas etme metodu
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
