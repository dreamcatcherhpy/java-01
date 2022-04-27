package com.huawei.operator;

/**
 * ClassName:Demo05
 * Package:com.huawei.operator
 * Description:Just practice.
 *
 * @Date:2022/4/24 15:43
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo05 {
    public static void main(String[] args) {
        //逻辑运算符   与（and）  或（or）  非（取反）
        boolean a = true;
        boolean b = false;

        System.out.println("a&&b:" + (a && b));  //逻辑与运算：两个变量都为真，结果true
        System.out.println("a||b:" + (a || b));  //逻辑或运算：两个变量有一个为真，结果蔡伟true
        System.out.println("!(a&&b):" + !(a && b));  //如果为真，则变为假，如果为假则变为真

        //短路运算  如果&&前为false，则不执行&&后的内容
        int c = 5;
        boolean d = (c < 4) && (c++ < 4);
        System.out.println(d);
        System.out.println(c);

    }
}
