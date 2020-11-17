/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITAPCHUONG1;

import java.util.Scanner;

/**
 *
 * @author Thu Thuỷ
 */
public class bai3 {
    public static void PTB2(float a, float b, float c){
        float x , x1, x2;
        if(a == 0){
            if(b == 0)
                System.out.println("phương trình vô nghiệm");
            else
            {
                x = - c / b;
                System.out.println("phương trình có một nghiệm " + x);
            }
        }
        else{
            float denta = b*b -4*a*c;
            if(denta > 0){
                x1 = (float) ((-b + Math.sqrt(denta))/(a*2));
                x2 = (float) ((-b - Math.sqrt(denta))/(a*2));
                System.out.println("phương trình có hai nghiệm phân biệt là :" + "x1 = " + x1 + " x2 = "+ x2);
            }
            else 
                if(denta == 0){
                    x1 = -b/(2*a);
                    System.out.println("phương trình có nghiêm kép x1 = x2 = " + x1);
                }
                else
                    System.out.println("phương trình vô nghiệm");
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        float a = sc.nextFloat();
        System.out.println("nhập b");
        float b = sc.nextFloat();
        System.out.println("nhập c");
        float c = sc.nextFloat();
        PTB2(a,b,c);
    }
    
}
