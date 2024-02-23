/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan_2;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Percabangan_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Input section
        System.out.println("masukan panjang sisi Pertama: ");
        double sisi1 = scanner.nextDouble();
        System.out.println("masukan panjang sisi Kedua: ");
        double sisi2 = scanner.nextDouble();
        System.out.println("masukan panjang sisi Ketiga: ");
        double sisi3 = scanner.nextDouble();
        
        //Proses dan Output section
        if (sisi1 == sisi2) {
            if (sisi2 == sisi3){
                System.out.println("Termasuk Kubus");
            } else {
                System.out.println("Bukan Kubus");
            }
        } else {
            System.out.println("Bukan Kubus");
        }
    }
    
}
