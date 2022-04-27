package com.huawei.struct;

/**
 * ClassName:LabelDemo
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/27 10:06
 * @Author:dreamcatcherhpy@huawei.com
 */
public class LabelDemo {
    public static void main(String[] args) {
        //打印101-150之间所有的质数

        int count = 0;
        // 标签
        outer:
        for (int i = 101; i <= 150; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
