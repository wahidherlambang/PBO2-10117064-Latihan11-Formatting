/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan11.formatting;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * format
 */
public class PBO210117064Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n ", i);
        System.out.printf("%%10d : %10d%n ", i);
        System.out.printf("%%+10d : %+10d%n ", i);
        System.out.printf("%%+10d : %+10d%n ", iMinus);
        System.out.printf("%%,10d : %,10d%n ", i);
        System.out.printf("%%-10d : %-10d%n ", i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n ", f);
        System.out.printf("%%.2f : %.2f%n ", f);
        System.out.printf("%%12.2f : %12.2f%n ", f);
        System.out.printf("%%,12.2f : %,12.2f%n ", f);
        
        
    }
    
}
