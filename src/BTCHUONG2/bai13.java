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
/*
13. Kiểm tra số K có thuộc dãy Fibonaci hay không? Nếu có thì chỉ ra đó là phần
tử ở vị trí thứ mấy của dãy Fibonaci.
 */
public class bai13 {
    public void Fibo(int n) {
        int T = 0, S = 1, TG = 0, i = 1, d = 0;
        while (S <= n) {
            System.out.print(S + " ");
                TG = T + S;
                T = S;
                if (S == n) {
                System.out.println("\nThuoc day Fibo va o vi tri thu " + i);
                d++;
                break;
                }
                S = TG;
                i++;
                }
                if (d == 0)
                    System.out.println("\nKhong thuoc day Fibo.");
	}
    public static void main(String[] args) {
        bai13 dt=new bai13();
        dt.Fibo(6);
        dt.Fibo(8);
        
    }
}
