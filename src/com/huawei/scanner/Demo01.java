package com.huawei.scanner;


import java.util.Scanner;

/**
 * ClassName:Demo01
 * Package:com.huawei.scanner
 * Description:Just practice.
 *
 * @Date:2022/4/26 9:51
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo01 {
    public static void main(String[] args) {

        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有字符串输入
        if (scanner.hasNext()) {
            //使用next方式接受
            String str = scanner.next();
            System.out.println("输出的内容为：" + str);
        }
        //凡是属于IO流的类如果不关闭会一直占用资源，要养成好习惯用完就关掉
        scanner.close();

    }
}
