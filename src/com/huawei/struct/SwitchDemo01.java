package com.huawei.struct;

/**
 * ClassName:SwitchDemo01
 * Package:com.huawei.struct
 * Description:Just practice.
 *
 * @Date:2022/4/26 15:31
 * @Author:dreamcatcherhpy@huawei.com
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        //case穿透   switch匹配一个具体的值
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
