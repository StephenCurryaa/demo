package com.example.demo.Stream;/**
 * Created by 170251 on 2019/10/24.
 */

/**
 * @program: demo
 * @description: personalModel
 * @author: Mr.Gao
 * @create: 2019-10-24 17:59
 **/
public  abstract class PersonModel implements Comparable{
    String name;
    Integer age;
    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public PersonModel (String name,Integer age,String sex){
this.name =name;
this.age=age;
this.sex=sex;
    }
}
