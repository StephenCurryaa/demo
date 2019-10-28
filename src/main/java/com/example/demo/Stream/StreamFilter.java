package com.example.demo.Stream;/**
 * Created by 170251 on 2019/10/28.
 */

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: demo
 * @description: Filter
 *
  遍历数据并检查其中的元素时使用。
  filter接受一个函数作为参数，该函数用Lambda表达式表示。
 * @author: Mr.Gao
 * @create: 2019-10-28 11:24
 **/
public class StreamFilter {
    /**
     * 过滤所有的男性
     */
    public static void fiterSex(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())){
                temp.add(person);
            }
        }
        System.out.println(JSON.toJSONString(temp));
        //new
        List<PersonModel> collect = data
                .stream()
                .filter(person -> "男".equals(person.getSex()))
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));
    }

    /**
     * 过滤所有的男性 并且小于20岁
     */
    public static void fiterSexAndAge(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())&&person.getAge()<20){
                temp.add(person);
            }
        }

        //new 1
        List<PersonModel> collect = data
                .stream()
                .filter(person -> {
                    if ("男".equals(person.getSex())&&person.getAge()<20){
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));

        //new 2
        List<PersonModel> collect1 = data
                .stream()
                .filter(person -> ("男".equals(person.getSex())&&person.getAge()<20))
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect1));

    }
    public static void main(String[] args) {
        fiterSex();
    }
}
