package com.example.demo.Stream;/**
 * Created by 170251 on 2019/10/28.
 */

import java.util.stream.Stream;

/**
 * @program: demo
 * @description: StreamReduce
 * @author: Mr.Gao
 * 感觉类似递归
   数字(字符串)累加
   个人没咋用过
 * @create: 2019-10-28 13:11
 **/
public class StreamReduce {
    public static void reduceTest(){
        //累加，初始化值是 10
        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(10, (count, item) ->{
                    System.out.println("count:"+count);
                    System.out.println("item:"+item);
                    return count + item;
                } );
        System.out.println(reduce);

        Integer reduce1 = Stream.of(1, 2, 3, 4)
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce1);

        String reduce2 = Stream.of("1", "2", "3")
                .reduce("0", (x, y) -> (x + "," + y));
        System.out.println(reduce2);
    }
}
