package com.huawei.struct;

/**
 * ClassName:BreakDemo
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/27 9:53
 * @Author:dreamcatcherhpy@huawei.com
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i=0;
        while (i < 100) {
            i++;
            System.out.println(i);
            if (i == 30) {
                break;  //用于强制退出循环，但不会终止程序
            }
        }
        System.out.println("123");
    }
}
