package com.company;
import java.util.Scanner;
public class Main {
    private static double sin;
    private static double cos;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double a= sin * (2 * x);
        double b= sin * ( 5 * x);
        double c= sin * ( 3 * x);
        double d=a+b-c;
        double a1= cos * x;
        double b1= cos * (3 * x);
        double c1= cos * (5 * x);
        double d1=a1-b1+c1;
        double z=d/d1;
        System.out.print(z);
        in.close();
    }
}