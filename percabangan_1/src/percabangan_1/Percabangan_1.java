/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan_1;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Percabangan_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Masukan tiga karakter (huruf kecil):");
       String input = scanner.nextLine();
       
       // jika input terdiri lebih dari 3 karakter
       if (input.length() != 3) {
           System.out.println("Input harus terdiri dari tiga karakter");
           return;
       }
       
       //variable untuk menampung input dari user
       char huruf1 = input.charAt(0);
       char huruf2 = input.charAt(1);
       char huruf3 = input.charAt(2);
       
       // Jika user jahil/ salah memasukan huruf besar
       if (!(huruf1 >= 'a' && huruf1 <= 'z') || !(huruf2 >= 'a' && huruf2 <= 'z') || !(huruf3 >= 'a' && huruf3 <= 'z')){
           System.out.println("Input tidak valid, Input harus berupa huruf kecil");
           return;
       }
       
       boolean huruf1Konsonan = "bcdfghjklmnpqrstvwxyz".indexOf(huruf1) != -1;
       boolean huruf2Vokal = "aiueo".indexOf(huruf2) != -1;
       boolean huruf3Konsonan = "bcdfghjklmnpqrstvwxyz".indexOf(huruf3) != -1;
       
       //Ouput keluaran program
       if(huruf1Konsonan && huruf2Vokal && huruf3Konsonan) {
           System.out.println("Urutan konsonan - vokal - konsonan terpenuhi");
       } else {
           System.out.println("Urutan konsonan - vokal - konsonan tidak terpenuhi");
       }
    }
    
}
