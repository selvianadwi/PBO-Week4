
package week4;

import java.util.Scanner;

public class Rumus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jawab;
        
        do{
            System.out.println("Masukkan nilai a: ");
            double a = input.nextDouble();

            System.out.println("Masukkan nilai b: ");
            double b = input.nextDouble();

            System.out.println("Masukkan nilai c: ");
            double c = input.nextDouble();

            //rumus determinan
            double D = b*b - 4*a*c;

            if(D > 0){
                double x1 = (-b + Math.sqrt(D))/(2*a);
                double x2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("x1 = " +x1);
                System.out.println("x2 = " +x2);
                        
            }
            else if(D == 0){
                //X1 = X2 =>X
                double x1 = -b/(2*a);
                System.out.println("X1 = "+x1);
            }
            else{
                double real = -b / (2 * a);
                double img = Math.sqrt(-D) / (2 * a);
                System.out.println("x1 = " +real);
                System.out.println("x2 = " +img);
            }
            
            System.out.print("Input data lagi [Y/T]? ");
            jawab = input.next();
        } while(jawab.equalsIgnoreCase("Y"));
        
       input.close();
    }
}
