package com.huawei.scanner;

import java.util.Scanner;

/**
 * ClassName:Demo05
 * Package:com.huawei.scanner
 * Description:Just practice.
 *
 * @Date:2022/4/26 13:49
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入多少个数字
        int m=0;

        System.out.println("请输入数据：");
        //通过循环判断是否还有输入，并进行求和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m++; //m=m+1;
            sum += x; //sum=sum+x;
            System.out.println("你输入了第"+m+"个数据，然后当前的结果为："+sum);
        }

        System.out.println(m+"个数的和为："+sum);
        System.out.println(m+"个数的平均值是："+(sum/m));

        scanner.close();
    }
}
