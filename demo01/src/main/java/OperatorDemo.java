/*
逻辑运算符
数学中一个数字3<x<6可以这样表达
但是java中需要拆分，即 3<x && x<6
 */


import java.util.Arrays;

public class OperatorDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        //&(与) 有false则false
        System.out.println((i>j) & (i>k));//false & true
        System.out.println((i<j) & (i>k));//true & false
        System.out.println((i>j) & (i<k));//false & true
        System.out.println((i<j) & (i<k));// true & true
        System.out.println("-----------------");

        //|(或) 有true则true
        System.out.println((i>j) | (i<k));//false | true
        System.out.println((i<j) | (i<k));//true | false
        System.out.println((i>j) | (i>k));//false | true
        System.out.println((i<j) | (i>k));// true | true
        System.out.println("-----------------");

        //^(异或)x相同则为false，不同则为true
        System.out.println((i>j) ^ (i<k));//false ^ true
        System.out.println((i<j) ^ (i<k));//true ^ false
        System.out.println((i>j) ^ (i>k));//false ^ true
        System.out.println((i<j) ^ (i>k));// true ^ true
        System.out.println("-----------------");

    }
}
