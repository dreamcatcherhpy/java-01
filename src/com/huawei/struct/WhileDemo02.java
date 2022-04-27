package com.huawei.struct;

/**
 * ClassName:WhileDemo02
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 16:29
 * @Author:dreamcatcherhpy@huawei.com
 */
public class WhileDemo02 {
    public static void main(String[] args) {
        //计算1+2+3+...+100=?

        int i=0;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println(sum);

    }
}
