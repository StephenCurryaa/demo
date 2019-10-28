package com.example.demo.Stream;/**
 * Created by 170251 on 2019/10/28.
 */

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: demo
 * @description: FlatMap
 *顾名思义，跟map差不多,更深层次的操作
  但还是有区别的
  map和flat返回值不同
  Map 每个输入元素，都按照规则转换成为另外一个元素。
  还有一些场景，是一对多映射关系的，这时需要 flatMap。
  Map一对一
  Flatmap一对多
  map和flatMap的方法声明是不一样的
  <r> Stream<r> map(Function mapper);
  <r> Stream<r> flatMap(Function> mapper);
  map和flatMap的区别：我个人认为，flatMap的可以处理更深层次的数据，入参为多个list，结果可以返回为一个list，而map是一对一的，入参是多个list，结果返回必须是多个list。通俗的说，如果入参都是对象，那么flatMap可以操作对象里面的对象，而map只能操作第一层。
 * @author: Mr.Gao
 * @create: 2019-10-28 11:31
 **/
public class FlatMap {
    public static void flatMapString() {
        List<PersonModel> data = Data.getData();
        //返回类型不一样
        List<String> collect = data.stream()
                .flatMap(person -> Arrays.stream(person.getName().split(" "))).collect(Collectors.toList());
        System.out.println("collect"+ collect);

        List<Stream<String>> collect1 = data.stream()
                .map(person -> Arrays.stream(person.getName().split(" "))).collect(Collectors.toList());
        System.out.println("collect1"+ JSON.toJSONString(collect1));

        //用map实现
        List<String> collect2 = data.stream()
                .map(person -> person.getName().split(" "))
                .flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println("collect2"+ collect2);

        //另一种方式
        List<String> collect3 = data.stream()
                .map(person -> person.getName().split(" "))
                .flatMap(str -> Arrays.asList(str).stream()).collect(Collectors.toList());
        System.out.println("collect3"+ collect3);

    }
}
