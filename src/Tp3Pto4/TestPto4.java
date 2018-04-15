package Tp3Pto4;

import java.util.Scanner;

public class TestPto4 {
    public static void main(String[] args) {
      
      ArregloDeNumeros arreglo = new ArregloDeNumeros();
      OperacionArreglo operacion = new OperacionArreglo();
      Scanner sc =new Scanner(System.in);
      double[] vector1 = new double[10];
      double[] vector2 = new double[10];
      double a;
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese Numero: ");     
                a=sc.nextDouble();
                vector1[i]=a;
            }
      arreglo.setArreglo(vector1);
      vector2=arreglo.getArreglo();
            for (int i = 0; i < 10; i++) {     
                System.out.println("Dato de la posicion: ["+(i+1)+"]"+" = "+vector2[i]);    
            }    
        System.out.println("El mayor numero ingresado es: "+ operacion.obtenerMayor(vector2));
        System.out.println("El menor numero ingresado es: "+ operacion.obtenerMenor(vector2));    
        System.out.println("El promedio es: "+ operacion.obtenerPromedio(vector2));
    }
}
