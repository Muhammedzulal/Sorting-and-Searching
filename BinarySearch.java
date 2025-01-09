package SortingSearching;

//!Sıralı Dizilerde Çalışır
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 8));
    }

    private static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchR(int[] array, int left, int right, int target) {
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (array[mid] == target)
            return mid;

        // Eğer aranan eleman, ortadakinden küçükse, sol yarıda ara
        if (target < array[mid])
            return binarySearchR(array, left, mid - 1, target);

        // Eğer aranan eleman, ortadakinden büyükse, sağ yarıda ara
        return binarySearchR(array, mid + 1, right, target);
    }
}
