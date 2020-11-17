/*
4.2 Nhập số nguyên dương m. Sau đó thực hiện các công việc như sau:
a. In ra số đảo ngược của m (m=123=>n=321)
b. Kiểm tra m có phải đối xứng không?
c. Kiểm tra m có thuộc dãy Fibonaci không? Nếu có chỉ ra phần tử đó ở vị trí thứ mấy
của dãy Fibonaci.
 */
package BAITAPCHUONG4;
import java.io.*;
public class BAI2 {
    public int nhapso() throws IOException{
        InputStreamReader vao= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(vao);
        String s=br.readLine();
        return Integer.parseInt(s);
    }
    public  int daoNguoc(int m) {
        int tg,dn=0;
        while(m>0){
            tg=m%10;
            dn=dn*10+tg;
            m=m/10;
    }
        return dn;
    }
     public void ktraSDX(int m){
        int n=m;
        if(m!=0)
            daoNguoc(m);
        if(daoNguoc(m)==n)
            System.out.println(+n+" la so doi xung ");
        else
            System.out.println(+n+" khong la so doi xung");
    }
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
        BAI2 dt=new BAI2();
        int m = 0;
        try{
            do{
                System.out.println("nhap so nguyen duong m: ");
                m=dt.nhapso();
            }while(m<=0);
        }catch(Exception e){}
        System.out.println("so da nhap la: " +m);
        System.out.println("dao nguoc cua so do la: "+dt.daoNguoc(m));
        dt.ktraSDX(m);
        dt.Fibo(m);
    }
}
