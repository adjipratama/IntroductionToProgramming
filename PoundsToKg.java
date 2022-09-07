// 2502163612 - Adji Pratama Irawan
// BOL - Information Systems

import java.util.Scanner;

public class PoundsToKg {

    public static void main(String[] args){

        double pound, kg, cnv = 0.454;
        
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Pounds to Kilograms");
        System.out.println("--------------------------");

        System.out.print("Pound : ");
        pound = scanner.nextFloat();

        //Convert
        kg = pound * cnv;

        System.out.println(pound+" Pound = "+kg+" Kg");
    }
}
