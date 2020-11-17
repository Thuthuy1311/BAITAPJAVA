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
public class bai1if {
    public void timmax(int a, int b, int c ){
        int max = a;
        if(max < b)
                max = b;
        if(max < c)
                max = c;
        System.out.println("giá trị lớn nhất là :"+ max);
    }
    public static void main(String[] args) {
        bai1if dt = new bai1if();
        dt.timmax(4, 7, 9);
        dt.timmax(11, 78, 0);
    }
}
