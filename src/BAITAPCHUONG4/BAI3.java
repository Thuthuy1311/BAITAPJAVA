/*
4.3 Nhập vào một chuỗi ký tự tùy ý và thực hiện các công việc sau:
a. In ra chuỗi đảo ngược của chuỗi đã cho
b. Đổi chuổi đã cho sang chữ hoa
c. Đổi chuỗi đã cho sang chữ thường
d. Đổi chuỗi đã cho sang vừa chữ hoa vừa chữ thường
 */
package BAITAPCHUONG4;
import java.io.*;
public class BAI3 {
    public String nhapChuoi() throws IOException{
        InputStreamReader nhap=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(nhap);
        String s=br.readLine();
        return s;   
    }
    public String chuoiDao(String s1){
        String s2=" ";
        for(int i=s1.length()-1;i>=0;i--)
            s2=s2+s1.charAt(i);
        return s2;
    }
    public String thuongHoa(String s1){
        String s2=" ";
        char c;
        for(int i=0;i<=s1.length()-1;i++){
            c= s1.charAt(i);
            if(c>='a'&&c<'z')
                c=(char) ((char)c-32);
            s2=s2+c;
        }
        return s2;
    }
    public String hoaThuong(String s1){
        String s2=" ";
        char c;
        for(int i=0;i<=s1.length()-1;i++){
            c=s1.charAt(i);
            if(c>='A'&&c<='Z')
                c=(char) ((char)c+32);
            s2=s2+c;
        }
        return s2;
    }
    public String THHT(String s1){
        String s2=" ";
        char c;
        for(int i=0;i<=s1.length()-1;i++){
            c=s1.charAt(i);
            if(c>='A'&&c<='Z')
                c=(char) ((char)c+32);
            else
                c=(char) ((char)c-32);
            s2=s2+c;
        }
        return s2;
    }
    public static void main(String[] args) throws IOException {
        BAI3 dt=new BAI3();
        String s = null;
            try{
              System.out.println("nhap chuoi: ");
              s=dt.nhapChuoi();
            }catch(Exception e){}
        System.out.println("chuoi da nhap la: " +s);
        System.out.println("dao nguoc cua so do la: "+dt.chuoiDao(s));
        System.out.println("thuong hoa: "+dt.thuongHoa(s));
        System.out.println("hoa thuong: "+dt.hoaThuong(s));
        System.out.println("thht: "+dt.THHT(s));
        
    }
}
