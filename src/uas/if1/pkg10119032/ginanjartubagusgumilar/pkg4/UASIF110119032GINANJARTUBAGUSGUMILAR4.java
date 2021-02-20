
package uas.if1.pkg10119032.ginanjartubagusgumilar.pkg4;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * NIM      : 10119032
 * Kelas    : IF 1
 * Tanggal  : 20/02/2021
 * No. Soal : 4
 * Deskripsi Program  : Pendataan  wisatawan dimana  user  dapat  memasukkan  
 * data  sendiri kedalam aplikasi
 * 
 */
public class UASIF110119032GINANJARTUBAGUSGUMILAR4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("APLIKASI PENDATAAN WISATAWAN");
        System.out.println("============================");
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kewarganegaraan : ");
        String kewarganegaraan = scan.nextLine();
        System.out.print("Tujuan Wisata : ");
        String tujuan = scan.nextLine();
        System.out.println("\n\n");
        System.out.println("HASIL DATA APLIKASI PENDATAAN WISATAWAN");
        System.out.println("=============================");
        System.out.println("Nama            : " + nama);
        System.out.println("Kewarganegaraan : " + kewarganegaraan);
        System.out.println("Tujuan Wisata   : " + tujuan);
        
        
        
    }

}
