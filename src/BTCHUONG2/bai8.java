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
public class bai8 {
    public static void kiemtra(int p){
        int bp  = (int) Math.sqrt(p);
        if(bp * bp == p){
            System.out.println(p + " là số chính phương");
        }
        else{
            System.out.println(p + " không phải là số chính phương");
        }
            
        
    }
    public static void main(String[] args) {
        bai8 dt = new bai8();
        dt.kiemtra(4);
        dt.kiemtra(8);
        dt.kiemtra(7);
        dt.kiemtra(16);
        
        
        
    }
}
