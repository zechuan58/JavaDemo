package com.itheima.day06test;

import java.util.Random;

public class Test07 {
    /**
     * 7. 随机产生验证码
     * 案例需求
     * 请从26个英文字母（大小写都包含），以及数字0-9中，随机产生一个5位的字符串验证码并打印在控制台
     * 效果：uYq8I，3r4Zj
     */
    public static void main(String[] args) {
        char[] ch = new char[62];
        //26个小写字母
        for (int i = 0; i < 26; i++) {
            ch[i] = (char) ('a' + i);
        }
        //26个大写字母
        for (int i = 0, j = 26; i < 26; i++) {
            ch[j++] = (char) ('A' + i);
        }
        //0-9数字
        for (int i = 0, j = 52; i < 10; i++) {
            ch[j++] = (char) ('0' + i);
        }

        //生成验证码
        StringBuilder str = new StringBuilder();
        //String str = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int in = r.nextInt(ch.length - 1);
            //拼接字符
            str.append(ch[in]);
            //str += ch[in];
        }
        System.out.print("验证码:" + str);
    }
}
