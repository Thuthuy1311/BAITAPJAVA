/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITAPCHUONG1;

/**
 *
 * @author Admin
 */
public class bai6 {
    public static int tinhtien(int a, int b){
       int tongtien = 0;
       if(b >=18){
           int quagio = b - 18;
           tongtien = quagio * 60000;
           tongtien = tongtien + (18 - a)*45000;
       }
       else
           tongtien = (b - a)*45000 ;
       return tongtien;
    }
    public static void main(String[] args) {
        System.out.println("tổng tiên hát karaoke của quý khách là " + tinhtien(7,20));
        System.out.println("tổng tiên hát karaoke của quý khách là " + tinhtien(7,18));
    }
    
}
