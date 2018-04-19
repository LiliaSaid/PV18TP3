
package Tp3Pto5;

//import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class TestPto5 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        ArrayList<Circulo> circulo = new ArrayList<Circulo>();
        double ra;
        int op;
            
            do{
                Circulo c1 = new Circulo();    
                System.out.println("---seleccione opcion ingresando el numero de opcion---");
                System.out.println("1) Agregar circulo ");
                System.out.println("2) salir");
                op=sc.nextInt();
                if(op==1){
                    System.out.println("Ingrese radio ");
                    ra=sc.nextDouble();
                    c1.setRadio(ra);
                    circulo.add(c1);
                    }
            }while(op!=2);
        Iterator<Circulo> it = circulo.iterator();    
              
         for(Circulo cir: circulo){//muestra los datos de array list falta colocar la ubicacion
            
             System.out.println("Radio ingresado: "+cir.getRadio());
             System.out.println("Perimetro:" + cir.calcularPer());
             System.out.println("Superficie:" + cir.calcularSup());
             System.out.println("--------------------------------------------");
        }
        
               
            
          
        }
    }
