/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VDTRENLOP;

/**
 *
 * @author Admin
 */
public class Ex3 {
    int maso;
    String hoten;
    String diachi;
    public void insert(int maso, String hoten, String dchi){
        this.maso = maso;
        this.hoten = hoten;
        diachi = dchi;
    }
    public void show(){
        System.out.println(maso);
        System.out.println(hoten);
        System.out.println(diachi);
    }public static void main(String[] args) {
    Ex3 sv1 = new Ex3();
        sv1.insert(1, "thu thuy", "quang ngai");
        sv1.show();
    Ex3 sv2 = new Ex3();
        sv2.insert(2, "xuan phuc ", "quang nam");
        sv2.show();
    }
}
