/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan_3;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Percabangan_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Input Section
        System.out.println("Masukan Jam Masuk Kerja: ");
        int jamMasukKerja = scanner.nextInt();
        
        System.out.println("Masukan jam Keluar Kerja: ");
        int jamKeluarKerja = scanner.nextInt();
        
        //proses penjumlahan waktu kerja
        int jumlahWaktu;
        
        if (jamKeluarKerja < jamMasukKerja){
            jamKeluarKerja += 12;
        }
        
        jumlahWaktu = jamKeluarKerja - jamMasukKerja;
        
        //output dari program
        System.out.println("lama Bekerja " + jumlahWaktu + " Jam");
    }
    
}
