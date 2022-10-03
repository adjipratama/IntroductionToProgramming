import java.util.Scanner;

public class ContohMethod {
    /**
     * @param args 
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int max;

        System.out.println("Bilangan Ganjil");

        System.out.print("Cetak bilangan ganjil hingga : ");
        max = sc.nextInt();
            
        //CALL METHOD
        ganjil(max);
    }

    //METHOD GANJIL
    private static void ganjil(int max){
        System.out.println("\nBilangan Ganjil :");

        for(int n=1; n<=max; n++){
            if(n%2 == 1){
                System.out.print(n+" ");
            }
        }
    }
}
