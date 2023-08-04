package com.driver;

public class Main {
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x ,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x * y;
        }
    }
    public static void main(String args[] ){
        Product p = new Produc();
        int result0 = p.product(2,4);
        System.out.println("result0:-" +result0);
        int result1 = p.product(2,4,5);
        System.out.println("result1 :-"+result);
        double result2 = p.product(2.56,4.987);
        System.out.println("result2 :-"+result2);
    }
}