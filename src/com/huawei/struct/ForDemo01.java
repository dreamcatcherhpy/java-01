package com.huawei.struct;

/**
 * ClassName:ForDemo01
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/27 8:58
 * @Author:dreamcatcherhpy@huawei.com
 */
public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1; //初始化条件

        while (a < 100) { //条件判断
            System.out.println(a);  //循环体
            a += 2;
        }
        System.out.println("while循环结束");

        //初始化//条件判断//迭代
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {

        }

        /*
        * 关于for循环的几点说明：
        * 最先执行初始化步骤，可以声明一种类型，也可初始化一个或多个循环控制变量，也可以是空语句。
        * 然后检测布尔表达式的值，如果为true，循环体被执行，如果为false，循环终止，开始执行循环体后面的语句。
        * 执行一次循环后，更新循环控制变量，迭代因子控制循环变量的增减。
        * 再次检测布尔表达式。
        * 循环执行上面的过程
        * */

        //死循环
        for( ; ; ){

        }
    }
}
