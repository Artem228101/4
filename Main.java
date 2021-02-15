package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 9;
        String number;
        switch (num) {
            case 0:
                number = "Zero";
                break;
            case 1:
                number = "One";
                break;
            case 2:
                number = "Two";
                break;
            case 3:
                number = "Three";
                break;
            case 4:
                number = "Four";
                break;
            case 5:
                number = "Five";
                break;
            case 6:
                number = "Six";
                break;
            case 7:
                number = "Seven";
                break;
            case 8:
                number = "Eight";
                break;
            case 9:
                number = "Nine";
                break;
            default:
                number = "Error";
                break;
        }
        System.out.println(number);
        in.close();
    }
}