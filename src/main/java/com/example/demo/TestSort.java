package com.example.demo;

import java.util.Arrays;

/**
 * Created by 170251 on 2018/5/8.
 */
public class TestSort {
    /**
     * 用Java实现一个冒泡排序算法
     */

//        public static void main(String[] args) {
//            int[] sortNum = {12,33,28,86,15,62,9,38};       //定义数组
//            bubbleSort4(sortNum);                           //开始排序
//            System.out.println(Arrays.toString(sortNum));   //打印结果
//        }

        /**
         * 写法一：从小到大顺序进行排列，从[前面]开始比较。。。容易理解。
         *
         * @param sortNum
         */
        private static void bubbleSort(int[] sortNum){
            int temp = 0;
            for (int i = 0; i < sortNum.length-1; i++) {         //第一个for循环控制排序要走多少趟，最多做n-1趟排序
                for (int j = 0; j < sortNum.length-1-i; j++) {       //第2个for循环控制每趟比较多少次
                    if(sortNum[j+1]<sortNum[j]){                 //大的往后面排
                        temp = sortNum[j];
                        sortNum[j] = sortNum[j+1];
                        sortNum[j+1] = temp;
                    }
                }
            }
        }

        /**
         * 写法二：从小到大顺序进行排列，从[后面]开始比较。。。不按常规套路出牌。
         *
         * @param sortNum
         */
        private static void bubbleSort2(int[] sortNum){
            int temp = 0;
            for (int i = 0; i < sortNum.length-1; i++) {         //第一个for循环控制排序要走多少趟，最多做n-1趟排序
                for (int j = sortNum.length-1; j > i; j--) {     //第2个for循环控制每趟比较多少次
                    if(sortNum[j-1]>sortNum[j]){                 //大的往后面排
                        temp = sortNum[j-1];
                        sortNum[j-1] = sortNum[j];
                        sortNum[j] = temp;
                    }
                }
            }
        }


        /**
         * 写法三：从小到大顺序进行排列，从[前面]开始比较。。。改进优化版。
         *
         * @param sortNum
         */
        private static void bubbleSort3(int[] sortNum){
            boolean flag = true;
            while(flag){
                flag = false;

                int temp = 0;
                for (int i = 0; i < sortNum.length-1; i++) {         //第一个for循环控制排序要走多少趟，最多做n-1趟排序
                    for (int j = 0; j < sortNum.length-1-i; j++) {       //第2个for循环控制每趟比较多少次
                        if(sortNum[j+1]<sortNum[j]){                 //大的往后面排
                            temp = sortNum[j];
                            sortNum[j] = sortNum[j+1];
                            sortNum[j+1] = temp;
                            flag = true;
                        }
                    }
                    //优化判断
                    if(!flag){// 若没有交换则排序完成，直接跳出
                        break;
                    }
                }
            }
        }

    /**
     * 冒泡倒序
     * @param sortNum
     */
    public static void bubbleSort4(int[] sortNum){
            int temp =0;
            for (int i=0;i<sortNum.length-1;i++){
                    for(int j=0;j<sortNum.length-1-i;j++){
                        if(sortNum[j]<sortNum[j+1]){
                            temp=sortNum[j];
                            sortNum[j]=sortNum[j+1];
                            sortNum[j+1]=temp;
                        }
                    }
            }
   }
    public static void main(String[] args) {
        SingletonDemo singleton1 = SingletonDemo.getInstance();
        SingletonDemo singleton2 = SingletonDemo.getInstance();
        System.out.println(singleton1==singleton2);
    }
}
