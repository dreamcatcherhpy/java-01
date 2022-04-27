package com.huawei.operator;

/**
 * ClassName:Demo07
 * Package:com.huawei.operator
 * Description:Just practice.
 *
 * @Date:2022/4/24 16:10
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b; //a = a + b;
        a -= b; //a = a - b;

        System.out.println(a);

        //字符串连接符   +   , String
        System.out.println("" + a + b);  //1020
        System.out.println(a + b + "");  //30
    }
}
