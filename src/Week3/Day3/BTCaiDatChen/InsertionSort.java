package Week3.Day3.BTCaiDatChen;

public class InsertionSort {
    static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 3, 8, 1, 5, 9, 0};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
