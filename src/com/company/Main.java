package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
while (true)
        try {
         method(sc.nextInt());}
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finish");
        }
    }
    public static void method(int a) throws Exception{

        if (a<0) {
            throw new Exception("san birden kichine");
        }
        else {
            int san = 1;
            for (int i = 1; i <= a; i++) {
              san *=i;
            }
            System.out.println(san);

}}}
