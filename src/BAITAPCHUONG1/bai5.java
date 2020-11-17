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
public class bai5 {
    public static  int sotrunggian(int a, int b, int c){
        if (b < a && a < c || c < a && a < b)
        return a;
        if (a < b && b < c || c < b && b < a)
        return b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("số trung gian là " + sotrunggian(3, 7, 6));
        System.out.println("số trung gian là " + sotrunggian(8, 3, 11));
        System.out.println("số trung gian là " + sotrunggian(5, 7, 9));
    }
}
