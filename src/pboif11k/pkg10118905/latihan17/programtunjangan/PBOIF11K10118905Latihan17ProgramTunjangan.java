/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan17.programtunjangan;

import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi:Program Tunjangan
 */
public class PBOIF11K10118905Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========= Program Tunjangan ========");
        System.out.println("Berapa Gaji Pokok Anda perbulan?\t:Rp. ");
        Scanner scanner = new Scanner (System.in);
        float gaji = scanner.nextFloat();
        
        System.out.println(" Status Anda?(Menikah/Belum)\t: ");
        String status = scanner.next();
        status = status.toLowerCase();
        float gaji_total, tunjangan = (status.equals("Menikah"))? gaji*35/100:0;
        gaji_total = gaji+tunjangan;
        System.out.println("\n=======hasil perhitungan gaji anda=======");
        System.out.println("Gaji pokok \t\t : Rp. "+ gaji);
        System.out.println("tunjangan\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp."+ gaji_total);
        System.out.println("(Developed by : Anindira Dina Fitriani)");
    }
    
}
