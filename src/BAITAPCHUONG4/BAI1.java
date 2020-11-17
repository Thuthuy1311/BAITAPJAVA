/*
    4.1 Nhập 2 số nguyên dương a và b. Sau đó in ra ước chung lớn nhất và bội chung nhỏ
nhất của 2 số nguyên dương a và b đó.
 */
package BAITAPCHUONG4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class BAI1 {
    public int docso() throws IOException{
        InputStreamReader vao=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(vao);
        String s=br.readLine();
        return Integer.parseInt(s);
        }
    public int uocChung(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;
            else    b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        BAI1 dt=new BAI1();
        int a=0,b=0;
        try{
            do{
                System.out.println("nhap a va b: ");
                a=dt.docso();
                b=dt.docso();
            }
            while(a<=0||b<=0);
        }
        catch(Exception e){ }
        System.out.println("uoc chung lon nhat: "+dt.uocChung(a,b));
        System.out.println("boi chung nho nhat: "+((a*b)/dt.uocChung(a,b)));
    }
}
