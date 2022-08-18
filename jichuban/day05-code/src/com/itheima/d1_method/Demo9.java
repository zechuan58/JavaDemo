package com.itheima.d1_method;

/*
目标：定义方法常见问题
1.方法不调用就不执行
2.方法与方法之间是平级关系，不能嵌套定义
3.方法的编写顺序和执行顺序无关
4.方法的返回值类型为void，表示该方法没有返回值，没有返回值的方法可以省略return语句不写
5.如果要编写return，后面不能跟具体的数据。
6.return语句下面，不能编写代码，因为永远执行不到，属于无效的代码
 */
public class Demo9 {
    public static void main(String[] args) {
        int  i = 2;
        if (i == 1) {
            return;
        }
        return;
        //System.out.println("main结束");
    }
}
