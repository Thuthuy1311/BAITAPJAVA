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
public class bai12 {
     public static int  fibo( int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if( n < 0)
            return -1;
        else if (n == 0|| n == 1) 
                return n; 
        else {
            for (int i = 2; i < n ; i ++){
                 f0 = f1;
                 f1 = fn;
                 fn = f0 + f1;
            }
        }   
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n");
        int n = sc.nextInt();
        System.out.println(  n + " số fibonaci đầu tiên của dãy fibonaci là ");
        for(int i = 0 ; i < n; i++ )
         System.out.print(fibo(i) + "\t"); 

    }
}
