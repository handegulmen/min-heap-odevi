import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void buildheap(int[] arr) {

        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }
    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if (left <= size && arr[left] > arr[i]) {
            max = left;
        } else {
            max = i;
        }

        if (right <= size && arr[right] > arr[max]) {
            max = right;
        }

        if (max != i) {
            exchange(arr, i, max);
            heapify(arr, max, size);
        }
    }

    public static void exchange(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static int[] heapSort(int[] arr) {

        buildheap(arr);
        int sizeOfHeap = arr.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            exchange(arr, 0, i);
            sizeOfHeap = sizeOfHeap - 1;
            heapify(arr, 0, sizeOfHeap);
        }
        return arr;
    }

    public static void main(String[] args) {

        int tmp;
        int i, s = 0;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("5 tane sayı girin :");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("MİN HEAP hesaplanack dizi:");
        System.out.println(Arrays.toString(arr));
        arr = heapSort(arr);
        System.out.println("MİN HEAP Sıralı Dizi : ");
        System.out.println(Arrays.toString(arr));
    }
}












