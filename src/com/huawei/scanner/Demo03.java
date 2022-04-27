package com.huawei.scanner;

import java.util.Scanner;

/**
 * ClassName:Demo03
 * Package:com.huawei.scanner
 * Description:Just practice.
 *
 * @Date:2022/4/26 13:31
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo03 {
    public static void main(String[] args) {
        //从键盘输入数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");
        String str = scanner.nextLine();
        System.out.println("输入的内容为：" + str);
        scanner.close();
    }
}
