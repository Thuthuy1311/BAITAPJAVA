/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCHUONG2;

/**
 *
 * @author Admin
 */
public class bai11 {
    public static boolean kiemtrashh(int n){
        int tong = 0;
        for(int i = 1; i < n ; i ++){
            if(n%i == 0)
                tong += i;
        }
        if(tong == n )
            return true;
        else
                return false;
    }
    public static void main(String[] args) {
        System.out.println("các số hoàn hảo nhỏ hơn 1000 là : ");
        for(int i = 1; i < 1000;i ++){
            if(kiemtrashh(i)== true)
                System.out.print(i + "\t");
        }
    }
}
