package heapSort;

public class HeapSort {
    private static void makeHeap (int[] arr, int size, int root){
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != root){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            makeHeap (arr, size, largest);
        }
    }

    public static void heapSort(int[] arr){
        for (int i = arr.length / 2 - 1; i >=0; i--) {
            makeHeap(arr, arr.length, i);
        }
        for (int i = arr.length - 1; i >=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            makeHeap (arr, i, 0);
        }
    }


}