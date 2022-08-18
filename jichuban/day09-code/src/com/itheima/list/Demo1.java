package com.itheima.list;

import java.util.ArrayList;

/*
集合的常用方法
    boolean add(E e)
          将指定的元素添加到此列表的尾部。
    public void add(int index,E e)
        在集合的指定索引位置添加元素

    public E remove(int index)
        从集合中删除指定索引的元素
    boolean remove(Object o)
          移除此列表中首次出现的指定元素（如果存在）。
    void clear()
          移除此列表中的所有元素。

    public E set(int index,E e)
        修改集合中指定索引的元素为新的元素。

    public E get(int index)
        获取集合中指定索引的元素

    public boolean contains(Object o)
        判断集合中是否包含指定元素
    public boolean isEmpty()
        判断集合是否为空(当集合长度为0时，即为空)

    public int size()
        获取元素的个数
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList();

        //打印集合
        //System.out.println(list);

        //添加元素到集合尾部
        // boolean add(E e)
        list.add("123");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //System.out.println(list);

        //添加元素到指定索引处(索引注意)
//        list.add(5, "蔡徐坤");
//        System.out.println(list);

        //根据元素删除
//        list.remove("123");
//        System.out.println(list);

        //根据索引删除
//        list.remove(3);
//        System.out.println(list);

        //删除全部元素
        //list.clear();
        //System.out.println(list);

        //将第二个元素,修改为"蔡徐坤"
//        String s = list.set(1, "蔡徐坤");
//        System.out.println("被修改:"+s);
//        System.out.println(list);

        //获取第1,2,3个元素
//        String s1 = list.get(0);
//        String s2 = list.get(1);
//        String s3 = list.get(2);
//        System.out.println("s1:"+s1);
//        System.out.println("s1:"+s2);
//        System.out.println("s1:"+s3);

        //是否包含"武媚娘"
//        boolean b = list.contains("武媚娘");
//        System.out.println("b:"+b);

        //集合是否为空
//        boolean empty = list.isEmpty();//集合容器已经存在,但是没有元素
//        System.out.println(empty);
//        System.out.println(list==null);//集合容器没有初始化

        //获取集合长度(元素个数)
//        int size = list.size();
//        System.out.println(size);

        //如何获取集合中的每一个元素?
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
