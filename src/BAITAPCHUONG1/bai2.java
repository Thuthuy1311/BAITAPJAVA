/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITAPCHUONG1;

import java.util.Scanner;

/**
 *
 * @author Thu Thuỷ
 */
public class bai2 {
    public static float  PTB1(float a, float b) {
        float x = 0;
        if( a == 0)
            System.out.println("phương trinh vô nghiệm");
        else{
            x = -b/a;
            System.out.println("phương trình có mộ nghiệm" + x);
        }
        return  x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        float a = sc.nextFloat();
        System.out.println("nhập b");
        float b = sc.nextFloat();
        PTB1(a, b);
        
    }
}
