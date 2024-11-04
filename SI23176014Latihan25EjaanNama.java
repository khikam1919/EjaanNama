/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan25.ejaannama;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini meminta pengguna untuk memasukkan nama depan mereka dan 
 * kemudian mengeja nama tersebut dengan menampilkan setiap huruf beserta posisinya.
 */
import java.util.Scanner;

public class SI23176014Latihan25EjaanNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan Anda untuk di eja: ");
        String nama = scanner.nextLine();

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + ": " + nama.charAt(i));
        }
    }
}
