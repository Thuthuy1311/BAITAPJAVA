/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCHUONG2;

import java.util.Scanner;

/**
 *
 * @author Thu Thuỷ
 */
public class bai5 {
    public static int tongcs(int n){
        int S = 0;
        while (n > 0){
            S = S + n % 10;
            n = n / 10;
        }
        return S;
    }
    public static int tichcs(int n){
        int P = 1;
        while (n > 0){
         P = P * (n % 10);
         n = n / 10;   
        }
        return P;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập số nguyên n ");
        int n = sc.nextInt();
        System.out.println("tổng các chữ số là : " + tongcs(n));
        System.out.println("tích các chữ số là : " + tichcs(n));
    }
}
