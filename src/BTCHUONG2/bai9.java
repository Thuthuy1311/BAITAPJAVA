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
public class bai9 {
    public void kiemtra(int n){
        int  rem, daonguoc = 0;
        int temp = n;
        while(temp != 0){
            rem = temp % 10;
            daonguoc = daonguoc * 10 + rem;
            temp = temp/10;
        }
        if(daonguoc == n)
            System.out.println(n + " là sô dối xứng");
        else
            System.out.println(n + " không phải là sô đối xứng");
} 
    public static void main(String[] args) {
        bai9 dt = new bai9();
        dt.kiemtra(121);
        dt.kiemtra(145541);
        dt.kiemtra(578);
    }
}
