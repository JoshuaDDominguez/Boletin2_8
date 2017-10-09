
package boletin2_8;

import java.util.Scanner;
public class Boletin2_8 {

    
    public static void main(String[] args) {
        
        double b100,b20,b5,m1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Intorduzca billetes de 100€");
        b100=sc.nextFloat()*100;
        System.out.println("Introduzca billetes de 20€");
        b20=sc.nextFloat()*20;
        System.out.println("Introduzca billetes de 5€");
        b5=sc.nextFloat()*5;
        System.out.println("introduzca monedas de 1€");
        m1=sc.nextFloat();
        System.out.println("Total intoducido = "+(b100+b20+b5+m1));
        
        
    }
    
}
