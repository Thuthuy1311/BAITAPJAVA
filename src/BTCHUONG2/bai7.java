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
public class bai7 {
    public static boolean kiemtra(int n){
        if (n == 0 || n == 1)
            return false;
        else {
            for(int i = 2 ; i < n ; i ++){
                if(n % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp n ");
        int n = sc.nextInt();
        if (kiemtra(n)== true)
            System.out.println(n + " là số nguyên tố");
        else 
            System.out.println(n + " không phải là số nguyên tố");
        
    }
}
