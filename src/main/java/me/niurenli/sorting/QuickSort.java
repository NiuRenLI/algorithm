package me.niurenli.sorting;

/**
 * @author : renli.niu
 * @version :  1.0
 * @describe : 快速排序
 * @date :  2019-07-07 18:41
 */
public class QuickSort {

    public static <T extends Comparable> void quickSort(T[] waitSort, int start, int end) {
        if (start < end) {
            int pIndex = partition(waitSort, start, end);
            quickSort(waitSort, start, pIndex - 1);
            quickSort(waitSort, pIndex + 1, end);
        }
    }

    /**
     * 找到数组分割下标
     *
     * @param array 待排序数组
     * @param start 开始下标
     * @param end   结束下标
     * @param <T>
     * @return
     */
    private static <T extends Comparable> int partition(T[] array, int start, int end) {
        T pivot = array[end];

        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (array[i].compareTo(pivot) <= 0) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        swap(array, pIndex, end);
        return pIndex;
    }

    /**
     * 交换数组元素
     *
     * @param array 待交换数组
     * @param left  左下标
     * @param right 右下标
     * @param <T>
     */
    private static <T extends Comparable> void swap(T[] array, int left, int right) {
        T temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        Integer[] ints = {1, 3, 245, 4, 2, 50, 35};
        //bubbleByFor(ints);
        quickSort(ints, 0, ints.length - 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
