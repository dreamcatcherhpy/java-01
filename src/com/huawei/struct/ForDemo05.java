package com.huawei.struct;

/**
 * ClassName:ForDemo05
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/27 9:47
 * @Author:dreamcatcherhpy@huawei.com
 */
public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("==========================");

        //遍历数组元素
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
