// 2502163612 - Adji Pratama Irawan
// BOL - Information Systems

import java.util.Scanner;
import java.lang.Math;

public class BelajarDeret {
    /**
     * @param args 
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int bnyk, beda;
        String cnfrm;

        do{
            System.out.println("\nBelajar Deret Aritmatika, Geometri, dan Menghitung Faktorial");
            System.out.println("-------------------------------------------------------------\n");

            //INPUT BANYAK ANGKA
            do{
                System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
                bnyk = sc.nextInt();
                if(bnyk<2 || bnyk>10){
                  System.out.println("\t- Masukkan angka 2-10");  
                }
            }while(bnyk<2 || bnyk>10);

            //INPUT BEDA MASING-MASING ANGKA
            do{
                System.out.print("Masukkan beda masing-masing angka [2..9] : ");
                beda = sc.nextInt();
                if(beda<2 || beda>9){
                  System.out.println("\t- Masukkan angka 2-9");  
                }
            }while(beda<2 || beda>9);
            
            //CALL METHOD
            aritmatika(bnyk, beda);
            geometri(bnyk, beda);
            faktorial(bnyk);
            
            //INPUT KONFIRMASI PENGULANGAN
            System.out.print("\nAnda mau ulang [y/n] : ");
            cnfrm= sc.next();

        }while(cnfrm.equalsIgnoreCase("y"));
        
    }

    //ARITMATIKA
    private static void aritmatika(int bnyk, int beda){
        System.out.println("\nDeret Aritmatika :");

        for(int n=1; n<=bnyk; n++){
            int Sn = 1+(n-1)*beda;
            System.out.print(Sn+" ");
        }
    }

    //GEOMETRI
    private static void geometri(int bnyk, int beda){
        System.out.println("\n\nDeret Geometri :");

        for(int n=1; n<=bnyk; n++){
            int Sn = 1*(int)Math.pow(beda, n-1);
            System.out.print(Sn+" ");
        }
    }

    //FAKTORIAL
    private static void faktorial(int bnyk){
        System.out.println("\n\nFaktorial dari "+bnyk+" :");
        int hasil=1;

        for(int n=bnyk; n>=1; n--){
            hasil = hasil*n;
            if(n!=1){
                System.out.print(n+" * ");
            }else{
                System.out.print(n);
            }
        }
        System.out.print(" = "+hasil+"\n");
    }
}
