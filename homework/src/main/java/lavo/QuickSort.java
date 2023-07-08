package lavo;

public class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Base case: the array is already sorted or empty
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 73, 41, 44, 99, 48, 45, 39, 23, 70, 6, 44, 50, 19, 21, 74, 78, 78, 36, 35, 97, 37, 88, 25, 91, 27,
                20, 17,
                54, 30, 59, 20, 78, 98, 48, 29, 22, 11, 57, 57, 58, 73, 27, 80, 15, 17, 69, 29, 63, 92, 60, 58, 97, 5,
                35,
                42, 45, 77, 69, 71, 94, 29, 1, 1, 64, 65, 73, 51, 68, 59, 35 };
        quickSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
