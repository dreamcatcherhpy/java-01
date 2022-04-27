package com.huawei.struct;

/**
 * ClassName:DoWhileDemo02
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 19:35
 * @Author:dreamcatcherhpy@huawei.com
 */
public class DoWhileDemo02 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }
        System.out.println("======================");
        do {
            System.out.println(a);
            a++;
        } while (a < 0);
    }
}
