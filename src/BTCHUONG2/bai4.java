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
public class bai4 {
    public static void tinhgt(int n){
        int i, p=1;
        for(i = 2 - (n %2); i <= n;  i += 2)
            p = p * i;
        System.out.println("n!! = " + p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n");
        int n = sc.nextInt();
        bai4 dt = new bai4();
        dt.tinhgt(n);
        
        
    }
}
