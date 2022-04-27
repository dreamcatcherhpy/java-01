package com.huawei.base;

/**
 * ClassName:Doc
 * Package:com.huawei.base
 * Description:Just practice.
 *
 * @Date:2022/4/24 16:39
 * @Author:dreamcatcherhpy@huawei.com
 * @version 1.0
 * @since 1.8
 */
public class Doc {

    String name;

    //参数信息
    /**
     * @author XX           //作者名
     * @version 1.0         //版本号
     * @since 17.0.3        //指明需要早期使用的jdk版本
     * @param name          //参数名
     * @return              //返回值情况
     * @throws Exception    //异常抛出情况
     */
    //加在类上面就是类的注释，加在方法上面就是方法的注释

    public String test(String name) throws Exception {
        return name;
    }

    //命令行实现  javados -encoding UTF-8 -charset UTF-8 Doc.java

    //IDEA实现



}
