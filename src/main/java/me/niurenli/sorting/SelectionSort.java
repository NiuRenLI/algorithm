package me.niurenli.sorting;

/**
 * 选择排序
 *Given an array of N items and L = 0, Selection Sort will:
 * 1 Find the position X of the smallest item in the range of [L...N−1],
 * 2 Swap X-th item with the L-th item,
 * 3 Increase the lower-bound L by 1 and repeat Step 1 until L = N-2.
 */
public class SelectionSort {

    public static <T extends Comparable<T>> void slctSort(T arr[], int length) {
        for (int i = 0; i < length - 1; i++) {
            //Initial index of min
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;

                }
            }

            //swapping if index of min is changed
            if (min != i) {
                T tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }

    public static void main(String[] args) {
// Integer Input
        int[] arr1 = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        int last = arr1.length;
        Integer[] array = new Integer[last];
        for (int i = 0; i < last; i++) {
            array[i] = arr1[i];
        }

        slctSort(array, last);

        // Output => 1	  4	 6	9	12	23	54	78	231
        for (int i = 0; i < last; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        // String Input
        String[] array1 = {"c", "a", "e", "b", "d"};
        last = array1.length;

        slctSort(array1, last);

        //Output => a b	 c	d	e
        for (int i = 0; i < last; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
