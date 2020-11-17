package BAITAPCHUONG4;
import java.io.*;

public class BAI6 {

    public int nhap() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public void nhapMang(int arr[][], int m, int n) {
        try {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("a[" + i + "][" + j + "]: ");
                    arr[i][j] = nhap();
                }
            }
        } catch (Exception e) { }
    }
    public void inMang(int arr[][], int m, int n) {
        System.out.println("Ma tran " + m + " dong " + n + " cot: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public int tinhTich(int arr[][], int m, int n) {
        int p = 1;
        for (int j = 0; j < n; j++) {
            if (arr[0][j] % 3 == 0) {
                p *= arr[0][j];
            }
        }
        return p;
    }
    public void taoMangX(int arr[][], int m, int n, int X[]) {

        for (int i = 0; i < m; i++) {
            int max = arr[i][0];
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            X[i] = max;
        }
        System.out.println("Mang X: ");
        for (int i = 0; i < m; i++) {
            System.out.print(X[i] + " ");
        }
    }

    public void xoaMang(int X[], int m) {
        for (int i = 0; i < m-1; i++) {
            X[i] = X[i + 1];
        }
        m--;
        if(m==0)
            System.out.println("Mang khong con phan tu!");
        for (int j = 0; j < m; j++) {
            System.out.print(X[j] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BAI6 dt = new BAI6();
        int m, n;
        System.out.println("Nhap so dong : ");
        m = dt.nhap();
        System.out.println("Nhap so cot : ");
        n = dt.nhap();
        int[][] arr = new int[m][n];
        dt.nhapMang(arr, m, n);
        dt.inMang(arr, m, n);
        System.out.println("Tich cac so boi 3 nam tren dong dau cua mang a: "+dt.tinhTich(arr, m, n));
        int[] X = new int[m];
        dt.taoMangX(arr, m, n, X);
        System.out.println("\nXoa mang: ");
        dt.xoaMang(X, m);
    }
}