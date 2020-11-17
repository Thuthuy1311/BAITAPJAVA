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
public class bai1 {
    public static float tinh(int n){
        float S = 0;
        int i ;
        for(i = 1 ;i <= n ; i++ )
            S += (1.0/i);
        return S;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n ");
        int n = sc.nextInt();
        System.out.println("tổng S = " + tinh(n));
    }
}
