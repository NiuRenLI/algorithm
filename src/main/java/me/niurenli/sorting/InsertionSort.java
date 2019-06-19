package me.niurenli.sorting;

/**
 * @author : renli.niu
 * @version :  1.0
 * @describe : 插入排序
 * @date :  2019-06-19 11:12
 */
public class InsertionSort {

    /**
     * 插入排序 基于比较
     *
     * @param waitSort 待排序数组
     * @param <T>      泛型
     */
    public static <T extends Comparable> void insertion(T[] waitSort) {
        T key;
        int length = waitSort.length;

        for (int i = 1; i < length; i++) {
            //比较基准
            key = waitSort[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(waitSort[j]) < 0) {
                waitSort[j + 1] = waitSort[j];
                j--;
            }
            waitSort[j + 1] = key;
        }

    }


    public static void main(String[] args) {
        String[] strings = {"d", "b", "a", "c","q","w","e","g"};
        insertion(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
