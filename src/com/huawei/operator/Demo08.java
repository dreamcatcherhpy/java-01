package com.huawei.operator;

/**
 * ClassName:Demo08
 * Package:com.huawei.operator
 * Description:Just practice.
 *
 * @Date:2022/4/24 16:14
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo08 {
    public static void main(String[] args) {
        //三元运算符
        //x ? y : z
        //如果x==true，则结果为y，否则结果为z

        int score = 50;
        String type = score < 60 ? "不及格" : "及格";
        //if
        System.out.println(type);
    }
}
