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
public class bai4 {
   public void giaiptbnhat(float a, float b, float c, float d, float e, float f){
    float D, Dx, Dy;
        D = a*e - b*d;
        Dx = c*e - b*f;
        Dy = a*f - c*d;
        if(D == 0 && Dx == 0)
        System.out.println("\n He pt vo so nghiem");
        if(D == 0 && Dx != 0)
        System.out.println("\n He pt vo nghiem");
        if(D != 0)
        {
        System.out.println("\n He co nghiem");
        System.out.println("\n x = " + Dx/D);
        System.out.println("\n y = " + Dy/D);
        }
    }
    public static void main(String[] args) {
        bai4 dt = new bai4();
        dt.giaiptbnhat(2,1,4,5,2,3);
        dt.giaiptbnhat(0,0,0,0,0,0);
        dt.giaiptbnhat(1,1,0,1,1,2);
        
    }
}
