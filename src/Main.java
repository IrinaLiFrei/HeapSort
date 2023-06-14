
import java.util.Date;

import static heapSort.HeapSort.heapSort;

public class Main {
    public static void main(String[] args) {
        int size = 10000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
//        for (int a : array)
//            System.out.printf("%d ", a);
//        System.out.println();

        Date start = new Date();
        heapSort(array);
        Date end = new Date();
        long time = end.getTime() - start.getTime();

        System.out.printf("Time: %d ", time);
    }

}

