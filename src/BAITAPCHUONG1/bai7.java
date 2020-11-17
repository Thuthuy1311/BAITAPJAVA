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
public class bai7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void xuatNgay(int year, int month){
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("30 ngay");break;
            case 2:
                if((year%4==0 && year%100!=0) || year%400==0)
                    System.out.println("29 ngay");
                else
                    System.out.println("28 ngay");
                break;
            default: System.out.println("31 ngay");
            
        }
    }
    public static void main(String[] args){
        System.out.println("nhập tháng : ");
        int thang = scanner.nextInt();
        System.out.println("nhập năm : ");
        int nam = scanner.nextInt();
        xuatNgay(nam, thang);
    }
}
