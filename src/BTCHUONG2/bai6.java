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
public class bai6 {
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a,b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a,b));
    }
    
}
