package com.huawei.base;

/**
 * ClassName:com.huawei.base.Demo08
 * Package:PACKAGE_NAME
 * Description:Just practice.
 *
 * @Date:2022/4/22 10:22
 * @Author:dreamcatcherhpy@huawei.com
 */
public class Demo08 {

    //类变量  static 从属于类，和类一起出现一起消失
    static double salary = 2500;

    //属性：变量

    //实例变量：方法外面，类里面，从属于对象，无需初始化，如果不自行初始化，默认值 0 0.0
    //布尔值：默认是false
    //除了基本类型，其他都是null

    static String name;
    static int age;

    //main方法
    public static void main(String[] args) {

        //局部变量：必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型  变量名字 = new com.huawei.base.Demo08();
        Demo08 demo08 = new Demo08();

        System.out.println(Demo08.age);
        System.out.println(Demo08.name);

        //类变量 static
        System.out.println(salary);

    }

    //其他方法
    public void add() {

    }
}
