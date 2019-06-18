package me.niurenli.sorting;

/**
 * @author : renli.niu
 * @version :  1.0
 * @describe : 冒泡排序
 * @date :  2019-06-18 14:04
 */
public class Bubble {

    /**
     * 通过For循环实现冒泡排序 升序
     *
     * @param needSort 待排序数组
     * @param <T>      泛型
     */
    public static <T extends Comparable<T>> void bubbleByFor(T[] needSort) {
        int length = needSort.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (needSort[i].compareTo(needSort[j]) < 0) {
                    T big = needSort[j];
                    needSort[j] = needSort[i];
                    needSort[i] = big;

                }
            }
        }

    }

    /**
     * 通过do...while实现冒泡排序 生序
     *
     * @param needSort 待排序数组
     * @param <T>      泛型
     */
    public static <T extends Comparable> void bubbleByDoWhile(T[] needSort) {
        boolean swap;
        int length = needSort.length;
        do {
            swap = false;
            for (int i = 0; i < length - 1; i++) {
                if (needSort[i].compareTo(needSort[i + 1]) > 0) {
                    T tmp = needSort[i + 1];
                    needSort[i + 1] = needSort[i];
                    needSort[i] = tmp;
                    swap = true;
                }
            }
            length--;
        } while (swap);

    }


    public static void main(String[] args) {
        Integer[] ints = {1, 3, 245, 4, 2, 50, 35};
        //bubbleByFor(ints);
        bubbleByDoWhile(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
