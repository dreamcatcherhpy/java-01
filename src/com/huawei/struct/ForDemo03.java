package com.huawei.struct;

/**
 * ClassName:ForDemo03
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/27 9:21
 * @Author:dreamcatcherhpy@huawei.com
 */
public class ForDemo03 {
    public static void main(String[] args) {
        //用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i+"\t");
            }
            if (i % (5 * 3) == 0) { //每行
                System.out.println();
//                System.out.print("\n");
            }
        }

        //println 输出完会换行
        //print  输出完不会换行

    }
}
