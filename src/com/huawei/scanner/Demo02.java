package com.huawei.scanner;

import java.util.Scanner;

/**
 * ClassName:Demo02
 * Package:com.huawei.scanner
 * Description:Just practice.
 *
 * @Date:2022/4/26 13:18
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        if (scanner.hasNextLine()) {
            String str = scanner.next();
            System.out.println("输出的内容为：" + str);
        }
        scanner.close();
    }
}
