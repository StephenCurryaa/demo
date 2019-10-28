package com.example.demo.Stream;/**
 * Created by 170251 on 2019/10/28.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: demo
 * @description: Map
 * map生成的是个一对一映射,for的作用
   比较常用
   而且很简单
 * @author: Mr.Gao
 * @create: 2019-10-28 11:30
 **/
public class StreamMap {
    /**
     * 取出所有的用户名字
     */
    public static void getUserNameList(){
        List<PersonModel> data = Data.getData();

        //old
        List<String> list=new ArrayList<>();
        for (PersonModel persion:data) {
            list.add(persion.getName());
        }
        System.out.println(list);

        //new 1
        List<String> collect = data.stream().map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(collect);

        //new 2
        List<String> collect1 = data.stream().map(PersonModel::getName).collect(Collectors.toList());
        System.out.println(collect1);

        //new 3
        List<String> collect2 = data.stream().map(person -> {
            System.out.println(person.getName());
            return person.getName();
        }).collect(Collectors.toList());
        System.out.println(collect2);

    }
}
