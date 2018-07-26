package me.niurenli.sorting;

public class BubbleSort {

    /**
     * 冒泡排序
     * 时间复杂度为O(N^2)
     *
     * @param array 待排序的数组
     * @param last  数组的长度
     * @param <T>
     */
    public static <T extends Comparable<T>> void BS(T array[], int last) {
        boolean swap;
        do {
            swap = false;
            //交换
            for (int count = 0; count < last - 1; count++) {
                int comp = array[count].compareTo(array[count + 1]);
                if (comp > 0) {
                    T temp = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = temp;
                    swap = true;
                }
            }
            last--;
        } while (swap);
    }

    public static void main(String[] args) {
        int a[] = {4, 23, 6, 78, 16, 30};
        int last = a.length;
        Integer[] integers = new Integer[last];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = a[i];
        }

        BS(integers, last);

        for (int i : integers) {
            System.out.println(i);
        }
    }

}
