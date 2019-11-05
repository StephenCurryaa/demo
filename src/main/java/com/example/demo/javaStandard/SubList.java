package com.example.demo.javaStandard;/**
 * Created by 170251 on 2019/11/4.
 */

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: demo
 * @description: SubList
 * @author: Mr.Gao
 * @create: 2019-11-04 17:08
 **/
public class SubList {
    public static void main(String[] args) {
//            List<Integer> list = Lists.newArrayList(1, 3, 5);
//            List<Integer> subList = list.subList(0, 1);
//        System.out.println(list);
//        System.out.println(subList);
//        subList.set(0, -1);
//        System.out.println(list);
//        System.out.println(subList);
//        List<Integer> list = Lists.newArrayList(1, 3, 5);
//        List<Integer> subList = list.subList(0, 1);
//        subList.remove(0);
//        System.out.println(list);
//        System.out.println(subList);

        List<Integer> list = Lists.newArrayList(1, 3, 5);
        List<Integer> subList = list.subList(0, 1);
        list.remove(0);
        System.out.println(list);
        System.out.println(subList);
    }
}
