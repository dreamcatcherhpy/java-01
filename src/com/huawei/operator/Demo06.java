package com.huawei.operator;

/**
 * ClassName:Demo06
 * Package:com.huawei.operator
 * Description:Just practice.
 *
 * @Date:2022/4/24 15:52
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo06 {
    public static void main(String[] args) {
        /*
         * A = 0011 1100
         * B = 0000 1101
         *--------------------------
         * A&B = 0000 1100
         * A|B = 0011 1101
         * A^B = 0011 0001  异或：相同为0，不同为1
         * ~B = 1111 0010
         *
         * 2*8 = 16 2*2*2*2
         * <<  *2
         * >>  /2
         *
         * 0000 0000    0
         * 0000 0001    1
         * 0000 0010    2
         * 0000 0011    3
         * 0000 0100    4
         * 0000 1000    8
         * 0001 0000    16
         *
         * */

        System.out.println(2 << 3);

    }
}
