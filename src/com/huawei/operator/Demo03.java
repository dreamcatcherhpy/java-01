package com.huawei.operator;

/**
 * ClassName:Demo03
 * Package:com.huawei.operator
 * Description:Just practice.
 *
 * @Date:2022/4/24 14:59
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo03 {
    public static void main(String[] args) {
        //关系运算符返回的结果：正确or错误  布尔值

        int a = 10;
        int b = 20;
        int c = 21;

        //取余，模运算
        System.out.println(c % a);  //c / a   21 / 10 = 2 ... 1

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

    }
}
