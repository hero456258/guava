package com.mingqian.guava.test;

public class GuavaTest {
    public static void main(String[] args) {
        GuavaTest test = new GuavaTest();
        Integer a = null;
        Integer b = new Integer(10);
        System.out.println(test.sum(a,b));
    }

    public Integer sum(Integer a, Integer b){
        return a + b;
    }
}
