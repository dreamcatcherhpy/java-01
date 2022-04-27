package com.huawei.struct;

import java.util.Scanner;

/**
 * ClassName:IfDemo01
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 14:38
 * @Author:dreamcatcherhpy@huawei.com
 */
public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = scanner.nextLine();

//        equals：判断字符串是否相等
        if (s.equals("Hello")) {
            System.out.println(s);
        }

        System.out.println("End");

        scanner.close();
    }
}
