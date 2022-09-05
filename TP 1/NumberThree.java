// 2502163612 - Adji Pratama Irawan
// BOL - Information Systems

import java.util.Scanner;

public class NumberThree{
    public static void main(String[] args){

        String nama, barang;
        int jmlBarang;
        float hBeli, hJual;

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Masukkan nama Anda : ");
        nama = scanner.nextLine();

        System.out.println("\nStok Gudang Input Barang");
        System.out.println("#########################");

        System.out.println("\nSelamat Datang "+nama);

        System.out.print("\nMasukkan nama barang yang mau ditambah : ");
        barang = scanner.nextLine();

        System.out.print("\nMasukkan jumlah barang yang mau ditambah : ");
        jmlBarang = scanner.nextInt();

        System.out.print("\nMasukkan harga beli untuk barang tersebut : ");
        hBeli = scanner.nextFloat();

        System.out.print("\nMasukkan harga jual untuk barang tersebut : ");
        hJual = scanner.nextFloat();

        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("#########################\n");

        System.out.println("Nama Barang \t : "+barang);
        System.out.println("Jumlah Barang \t : "+jmlBarang);
        System.out.print("Harga Beli \t : ");
        System.out.printf("%.2f", hBeli);
        System.out.print("\nHarga Jual \t : ");
        System.out.printf("%.2f", hJual);

    }
}