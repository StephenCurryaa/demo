package com.example.demo;

import java.util.Arrays;

/**
 * Created by 170251 on 2018/5/9.
 */
public class SelectSort {
    public static void selectSort(int[] a) {
        if (a == null || a.length <= 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int flag = i; // 将当前下标定义为最小值下标
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < temp) {// a[j] < temp 从小到大排序；a[j] > temp 从大到小排序
                    temp = a[j];
                    flag = j; // 如果有小于当前最小值的关键字将此关键字的下标赋值给flag
                }
            }
            if (flag != i) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = { 49,38,65,97,76,13,27,49 };
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
