package com.huawei.base;

/**
 * ClassName:com.huawei.base.Demo06
 * Package:PACKAGE_NAME
 * Description:Just practice.
 *
 * @Date:2022/4/24 9:30
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo06 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;   //-1474836480，计算时溢出了
        long total2 = money * years; //默认int，转换前已经存在问题了

        long total3 = money * ((long) years); //先把一个数转换为long
        System.out.println();

        // L  l
    }
}
