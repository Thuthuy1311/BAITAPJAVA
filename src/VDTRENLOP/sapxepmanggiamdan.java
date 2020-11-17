/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VDTRENLOP;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class sapxepmanggiamdan {
    public void nhapmang(int arr[],int n){
    Scanner sc = new Scanner(System.in);
    int i;
    for(i = 1; i <= n ; i++)
           {  
               System.out.print("nhap phan tu thu " + i + ":");
               arr[i]=sc.nextInt();
           }
    }
    public void xuatmang(int arr[], int n){
        int i;
        for(i = 1; i <= n; i ++)
            System.out.println("arr[ " + i + "] = " + arr[i]);
    }
    public void sapxep(int arr[], int n){
        int i,j, tg;
        for(i = 1; i <= n; i++)
            for(j = i + 1; j <= n; j++ ){
                if(arr[i] < arr[j])
                    {
                        tg = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tg;
                    }
            }
    }
    public static void main(String[] args) {
        sapxepmanggiamdan dt= new sapxepmanggiamdan();
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [100];
        System.out.println("nhập n = ");
        int n = sc.nextInt();
        dt.nhapmang(arr,n);
        dt.xuatmang(arr,n);
        dt.sapxep(arr,n);
        System.out.println("dãy số sau khi đươc săp xếp là: " );
        dt.xuatmang(arr,n);
    }
}
