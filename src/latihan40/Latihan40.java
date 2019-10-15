/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan40;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kepribadian check = new Kepribadian();
        Warna warna = new Warna();
        Scanner sc = new Scanner(System.in);
        System.out.println(warna.TXT_MERAH+"YUK "+warna.TXT_HIJAU+"CEK "+warna.TXT_KUNING+"KEPRIBADIANMU "+warna.TXT_CYAN+"DARI "+warna.TXT_UNGU+"WARNA "+warna.TXT_BIRU+"FAVORITMU");
        System.out.println(warna.DEFAULT+warna.TXT_PUTIH);
        System.out.println(warna.BG_MERAH+"       MERAH      ");
        System.out.println(warna.BG_HIJAU+"       HIJAU      ");
        System.out.println(warna.BG_KUNING+"      KUNING      ");
        System.out.println(warna.BG_BIRU+"       BIRU       ");
        System.out.println(warna.BG_UNGU+"       UNGU       "+warna.DEFAULT);
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warna_fav = sc.next();
        System.out.print("NAMA KAMU : ");
        String nama = sc.next();
        System.out.println("\n===HASIL TEST KEPRIBADIAN "+nama.toUpperCase()+"===");
        check.cek(warna_fav);
    }
    
}
