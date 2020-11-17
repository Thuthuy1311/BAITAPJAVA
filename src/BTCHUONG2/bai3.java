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
public class bai3 {
    public float tinhtongle(int n){
        float S = 0;
        int i ,a;
        for(i = 1 ; i <= n ; i++){
            a = 1;
            for(int j = 1; j <= 2*i - 1; j++){
                a = a*j;
            }
            S = (float) (S + 1.0/a);
         }
        return S;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        bai3 dt = new bai3();
        System.out.println("tổng S = " + dt.tinhtongle(n));
    }
}
