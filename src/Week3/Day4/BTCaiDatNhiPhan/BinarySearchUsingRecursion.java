package Week3.Day4.BTCaiDatNhiPhan;

public class BinarySearchUsingRecursion {
    int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = (high + low)/2;
            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) return binarySearch(arr, low, mid - 1, value);
            else return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }
}
