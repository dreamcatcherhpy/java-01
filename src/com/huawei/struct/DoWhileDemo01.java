package com.huawei.struct;

/**
 * ClassName:DoWhileDemo01
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 19:30
 * @Author:dreamcatcherhpy@huawei.com
 */
public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        //do-while至少执行一次循环

        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
    }
}
