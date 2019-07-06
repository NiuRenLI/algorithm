package me.niurenli.sorting;

/**
 * @author : renli.niu
 * @version :  1.0
 * @describe : 归并排序
 * @date :  2019-07-06 08:48
 */
public class MergeSort {
    public static <T extends Comparable> void merge(T[] waitSort, T[] tmp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            merge(waitSort, tmp, left, mid);
            merge(waitSort, tmp, mid + 1, right);
            conquest(waitSort, tmp, left, mid, right);
        }

    }

    private static <T extends Comparable> void conquest(T[] waitSort, T[] tmp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tmp[i] = waitSort[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (tmp[i].compareTo(tmp[j]) <= 0) {
                waitSort[k] = tmp[i];
                i++;
            } else {
                waitSort[k] = tmp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            waitSort[k] = tmp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        Integer[] tmp = new Integer[integers.length];
        merge(integers, tmp, 0, integers.length - 1);
        for (int i : integers) {
            System.out.println(i);
        }

//        String[] array1 = {"c", "a", "e", "b", "d"};
//        String[] temp1 = new String[array1.length];
//        merge(array1, temp1, 0, array1.length - 1);
//        for (String s : array1) {
//            System.out.println(s);
//        }

    }

}
