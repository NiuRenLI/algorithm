package me.niurenli.sorting;

/**
 * @author : renli.niu
 * @version :  1.0
 * @describe : 选择排序
 * @date :  2019-06-18 15:36
 */
public class SelectSort {

    /**
     * 选择排序
     * L=0
     * 1:Find the position X of the smallest item in the range of [L...N−1],
     * 2:Swap X-th item with the L-th item,
     * 3:Increase the lower-bound L by 1 and repeat Step 1 until L = N-2.
     *
     * @param waitSort 待排序数组
     * @param <T>      泛型
     */
    public static <T extends Comparable> void selectSort(T[] waitSort) {
        int length = waitSort.length;
        //找到最小元素的下标
        for (int i = 0; i < length - 1; i++) {
            //数组中最小值的下标
            int minIdx = i;
            for (int j = i + 1; j < length; j++) {
                if (waitSort[minIdx].compareTo(waitSort[j]) > 0) {
                    minIdx = j;
                }
            }
            //if minIdx change then swap
            if (minIdx != i) {
                T tmp = waitSort[minIdx];
                waitSort[minIdx] = waitSort[i];
                waitSort[i] = tmp;
            }

        }

    }

    public static void main(String[] args) {
        String[] strings = {"a", "e", "c", "z", "p", "d"};
        selectSort(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
