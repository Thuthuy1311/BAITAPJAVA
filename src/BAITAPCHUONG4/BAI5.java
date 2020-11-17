package BAITAPCHUONG4;
import java.io.*;

public class BAI5 {

    public int nhap() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public void nhapMang(int arr[], int n) {
        int i;
        System.out.println("Nhap cac phan tu mang: ");
        try {
            for ( i = 0; i < n; i++) {
                System.out.print("a["+i+"]:");
                arr[i] = nhap();
            }
        } catch (Exception e) {}
    }
    public void inMang(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: "+arr[i]);
            System.out.println("");
        }
    }
    public int tinhTong(int arr[], int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                s += arr[i];
            }
        }
        return s;
    }
    public void timPhanTu(int arr[], int n, int k) {
        int vt = 0;
        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                vt = i;
                break;
            }
        }
        if (vt != 0) {
            System.out.println(k + " thuoc mang va o vi tri thu: a[" + vt + "]");
        } else {
            System.out.println(k + " khong thuoc mang");
        }
    }
    public void sapXepMang(int arr[], int n) {
        int tg;    
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                }
            }
        }
    }
    public void chenPhanTu(int arr[], int n, int p) {
        int i = 0;
        while (i < n && arr[i] < p) {
            i++;
        }
        n++;
        for (int j = n - 1; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = p;
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BAI5 dt = new BAI5();
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = dt.nhap();
        int[] arr = new int[n +1];
        dt.nhapMang(arr, n);
        dt.inMang(arr, n);
        System.out.println("\nTong cac so duong le: " + dt.tinhTong(arr, n));
        int k;
        System.out.println("Nhap phan tu k can tim kiem: ");
        k = dt.nhap();
        dt.timPhanTu(arr, n, k);
        dt.sapXepMang(arr, n);
        System.out.println("Mang sau khi sap xep: ");
        dt.inMang(arr, n);
        System.out.println("\nChen so");
        int p;
        System.out.println("Nhap phan tu p can chen: ");
        p = dt.nhap();
        System.out.println("Mang sau khi chen: ");
        dt.chenPhanTu(arr, n, p);
    }
}