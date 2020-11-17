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
public class bai2 {
    public  float tinhtong(int n){
        float S = 15;
        int i , x , a = 1 ;
        for(i = 1 ;i <= n ; i++ ){
            if(i%2 == 0)
                x = 1;
            else
                x = -1;
            a*=i;
            S += x/a;
        }
        return S;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n ");
        int n = sc.nextInt();
        bai2 dt = new bai2();
        System.out.println("tổng S = " + dt.tinhtong(n));
    }
}
