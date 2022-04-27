package com.huawei.struct;

/**
 * ClassName:SwitchDemo02
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 15:44
 * @Author:dreamcatcherhpy@huawei.com
 */
public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "hello";
        //JDK7的新特性，表达式结果可以是字符串
        //字符的本质还是数字

        //反编译 java---class（字节码文件）---反编译（IDEA）

        switch (name) {
            case "world":
                System.out.println("world");
                break;
            case "hello":
                System.out.println("hello");
                break;
            default:
                System.out.println("wrong");
        }
    }
}
