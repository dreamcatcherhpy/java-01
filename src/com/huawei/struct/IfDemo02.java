package com.huawei.struct;

import java.util.Scanner;

/**
 * ClassName:IfDemo02
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 14:49
 * @Author:dreamcatcherhpy@huawei.com
 */
public class IfDemo02 {
    public static void main(String[] args) {
        //考试分数大于60分及格，小于60分不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score = scanner.nextInt();

        if (score > 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        scanner.close();
    }
}
