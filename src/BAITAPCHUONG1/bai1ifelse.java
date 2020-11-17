/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITAPCHUONG1;

/**
 *
 * @author Thu Thuỷ
 */
public class bai1ifelse {
    public static void timmax(int a, int b, int c){
        int max;
        if(a > b && a > c)
            max = a;
        else
        {
            if(b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("gia trị lớn nhất là : " + max );
    }
    public static void main(String[] args) {
        bai1ifelse dt = new bai1ifelse();
        dt.timmax(9, 7, 4);
        dt.timmax(98, 6, 5);
    }
}
