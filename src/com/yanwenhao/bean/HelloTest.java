package com.yanwenhao.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YANWENHAO
 * @create 2020-02-11 20:05
 */
public class HelloTest {

//    psf:全局常量      prsf:私有的静态常量
    public static final String s = "abcd";
    private static final Integer i = 1;

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        System.out.println("list = " + list);
        int i = 1;
        System.out.println(i);
    }
}
