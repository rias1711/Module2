package Week1.Day3;

public class CollapseArray {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[11];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) Math.floor(Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = (int) Math.floor(Math.random() * 10);
            System.out.print(arr2[j] + " ");
        }
        System.out.println("");

        for (int a = 0; a < arr1.length; a++) {
            arr3[a] = arr1[a];
        }
        for (int b = arr1.length; b < arr3.length; b++) {
            arr3[b] = arr2[b - arr1.length];
        }

        for (int c = 0; c < arr3.length; c++) {
            System.out.print(arr3[c] + " ");
        }
    }
}
