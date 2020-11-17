/*
    4.4Nhập một chuỗi ký tự tuỳ ý, sau đó thực hiện công việc sau:
    a. Chuyển kí tự đầu tiên của từng từ thành chữ hoa
    b. In ra mỗi từ của chuỗi đã cho trên mỗi dòng
    c. In ra các nguyên âm có trong chuỗi đã cho b.
    d. Đếm số từ có trong chuổi đã cho  
 */
package BAITAPCHUONG4;

import java.io.*;
public class BAI4 {
  public String nhapChuoi()  throws IOException{
      InputStreamReader nhap=new InputStreamReader(System.in);
      BufferedReader br= new BufferedReader(nhap);
      String s= br.readLine();
      return s;
  }
  
    // Ham chuyen ky tu dau tien cua tuan tu thanh chu hoa
    public String hoaThuong(String s1){
        String s2 = "";
        s1 = s1.toLowerCase();
        String [] arr = s1.split(" ");// s1.split(" "); la tach chuoi dua tren khoang trang
        for (String s : arr) {
            s2+= String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1)+" ";
        }
        return s2;
    }
       
    // Ham in tu ra cac dong
    public void inTu(String s1){
        String[] arr = s1.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }
    // ham in ra cac nguyen am
    public void nguyenAm(String s1){
        s1 = s1.toLowerCase();
        char kt;
        for (int i=0;i<s1.length();i++){
            kt = s1.charAt(i);
            if (kt == 'u' || kt == 'e' || kt == 'o' || kt =='a' || kt == 'i'){
                    System.out.print(kt+ "  ");
                }
            }
        System.out.println("");
    }
    // ham dem so tu
    public int demSoTu(String s1) {
        int count = 0;
        if (s1.charAt(0) != ' ') {
            count++;
        }
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)  {
        BAI4 dt = new BAI4();
        String st = "";
        try {
            System.out.println("Nhap vao mot chuoi: ");
            st = dt.nhapChuoi();
        } catch(Exception e){}
        System.out.println("Chuyen ky tu dau tien cua tung tu thanh chu hoa: " +dt.hoaThuong(st) );
        System.out.println("In ra moi tu cua chuoi da cho tren moi dong: ");
        dt.inTu(st);
        System.out.println("cac nguyen am co trong chuoi da cho: ");
        dt.nguyenAm(st);
        System.out.println("Dem so tu co trong chuoi da cho: "+dt.demSoTu(st));
    
}

    int nhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void nhapMang(int[] arr, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void inMang(int[] arr, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String tinhTong(int[] arr, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void timPhanTu(int[] arr, int n, int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sapXepMang(int[] arr, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void chenPhanTu(int[] arr, int n, int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
