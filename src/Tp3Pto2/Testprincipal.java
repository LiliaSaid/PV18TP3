package Tp3Pto2;

import java.util.Scanner;

public class Testprincipal {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        Scanner sc= new Scanner(System.in);
        UbicacionDePuntos pun = new UbicacionDePuntos();
        double x1,y1,base,altura;
        
        System.out.println("Ingrese valores para el primer punto formado por x1");
        x1=sc.nextDouble();
        System.out.println("Ingrese valores para el primer punto formado por y1");
        y1=sc.nextDouble();
        System.out.println("Ingrese base del rectangulo");
        base=sc.nextDouble();
        System.out.println("Ingrese altura del rectangulo");
        altura=sc.nextDouble();
        rec.setAltura(altura);
        rec.setBase(base);
        System.out.println("La superficie del rectangulo ingresado es "+rec.obtenerSuperficie());
        System.out.println("El perimetro del rectangulo ingresado es "+rec.obtenerPerimetro());
        
        pun.setAltura(altura);
        pun.setBase(base);
        pun.setX1(x1);
        pun.setY1(y1);
        
        System.out.println("El  primer punto tiene valor en x: "+x1+" - En y: "+y1);
        System.out.println("El  segundo punto tiene valor en x: "+x1+" - En y: "+pun.obtenerY2());
        System.out.println("El  tercero punto tiene valor en x: "+pun.obtenerX2()+" - En y: "+pun.obtenerY2());
        System.out.println("El  cuarto punto tiene valor en x: "+pun.obtenerX2()+" - En y: "+y1);
    }
}
