// 2502163612 - Adji Pratama Irawan
// BOL - Information Systems

import java.util.Scanner;
import java.util.Random;


public class NumberFour {
    /**
     * @param args 
     */
    public static void main(String[] args){

        String namaA, namaB;
        int umurA, umurB; 
        double randVal, res;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");
        
        System.out.println("Data Anda :");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.print("Masukkan Nama Anda  : ");
        namaA = scanner.nextLine();
        System.out.print("Masukkan Umur Anda  : ");
        umurA = Integer.parseInt(scanner.nextLine());
        
        System.out.println("\nData Pasangan Anda :");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.print("Masukkan Nama Pasangan Anda  : ");
        namaB = scanner.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda  : ");
        umurB = Integer.parseInt(scanner.nextLine());

        System.out.println("\n"+namaA+" ["+umurA+"] tahun");

        // LOVE
        System.out.println("\n  \u2665\u2665\u2665    \u2665\u2665\u2665");
        System.out.println(" \u2665\u2665\u2665\u2665\u2665  \u2665\u2665\u2665\u2665\u2665");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.println(" \u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.println("   \u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.println("     \u2665\u2665\u2665\u2665");
        System.out.println("      \u2665\u2665\n");

        System.out.println(namaB+" ["+umurB+"] tahun");

        System.out.println("\nTekan \"ENTER\" untuk melihat hasil ramalan ...");
        scanner.nextLine();

        Random random = new Random();
        randVal = random.nextDouble(100-50) + 50;
        res = randVal/1.1;
        
        System.out.print("Kecocokan Anda dengan Pasangan Anda adalah : ");
        System.out.printf("%.2f", res);
        System.out.print(" %");

        System.out.println("\n\n\nTerima Kasih karena Anda telah menggunakan jasa Ramalan kami .. ^^v");
    }
}
