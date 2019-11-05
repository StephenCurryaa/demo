package com.example.demo.stream;/**
 * Created by 170251 on 2019/10/24.
 */

import java.util.Arrays;
import java.util.List;

/**
 * @program: demo
 * @description: stream
 * @author: Mr.Gao
 * @create: 2019-10-24 17:57
 **/
public class Data {
    private static List<PersonModel> list = null;

    static {
        PersonModel wu = new PersonModel("wu qi", 18, "男");
        PersonModel zhang = new PersonModel("zhang san", 19, "男");
        PersonModel wang = new PersonModel("wang si", 20, "女");
        PersonModel zhao = new PersonModel("zhao wu", 20, "男");
        PersonModel chen = new PersonModel("chen liu", 21, "男");
        list = Arrays.asList(wu, zhang, wang, zhao, chen);
    }

    public static List<PersonModel> getData() {
        return list;
    }


}
