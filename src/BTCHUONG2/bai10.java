/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCHUONG2;

import static BTCHUONG2.bai7.kiemtra;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai10 {
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
         System.out.println("các số nguyên tố là : ");
        for(int i = 2; i <=n ; i ++){
            if(kiemtra(i) == true)
                System.out.println(i);
        }
        
    }
    
}
