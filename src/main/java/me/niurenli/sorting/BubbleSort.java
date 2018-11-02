package me.niurenli.sorting;

/**
 * 冒泡排序 范型
 * 可以用for嵌套 也可用do...while
 */
public class BubbleSort {

    /**
     * do while
     *
     * @param array
     * @param last
     * @param <T>
     */
    public static <T extends Comparable<T>> void bubbleSort_DW(T array[], int last) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < last - 1; i++) {
                int cmp = array[i].compareTo(array[i + 1]);
                if (cmp > 0) {
                    T tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    swap = true;
                }
            }
            last--;
        } while (swap);
    }


    /**
     * For 循环
     * @param arr
     * @param last
     * @param <T>
     */
    public static <T extends Comparable<T>> void bubbleSort_FOR(T arr[], int last) {
        for (int i = 0; i < last; i++) {
            for (int j = 0; j < last - 1; j++) {
                //Operator '>' cannot be applied to 'T', 'T' arr[i]>arr[j] 编译时异常
                if (arr[i].compareTo(arr[j]) < 0) {
                    T tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
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

        // bubbleSort_DW(array, last);
        bubbleSort_FOR(array, last);
        // Output => 1	  4	 6	9	12	23	54	78	231
        for (int i = 0; i < last; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        // String Input
        String[] array1 = {"c", "a", "e", "b", "d"};
        last = array1.length;

        bubbleSort_FOR(array1, last);

        //Output => a b	 c	d	e
        for (int i = 0; i < last; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
