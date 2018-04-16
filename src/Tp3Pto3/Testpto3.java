
package Tp3Pto3;

import java.util.Scanner;

public class Testpto3 {
    
    public static void main(String[] args){
        Triangulo triangulo= new Triangulo();
        Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese lado");
       float a=sc.nextFloat();
       System.out.println("Ingrese lado");
       float b=sc.nextFloat();
       System.out.println("Ingrese lado");
       float c=sc.nextFloat();
       if((Math.abs(a - c) < b) && (b < (a + c))) {//math.abs devuelve el valor absoluto y que sea positivo
           triangulo.setPerimetro(a, b, c);
           System.out.println("El perimetro del triangulo es: "+ triangulo.getPerimetro());                                           //ademas de controlar que los lados formen un triangulo 
       }else{
        System.out.println("No Forma un triangulo");
       }
    }
}
    
    

