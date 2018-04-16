
package Tp3Pto5;

//import java.util.Iterator;
import java.util.Scanner;
public class TestPto5 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        GestorCirculos gc = new GestorCirculos();
        
        int op;
            
            do{
                            //       Circulo c1 = new Circulo();    
                System.out.println("---seleccione opcion ingresando el numero de opcion---");
                System.out.println("1) Agregar circulo ");
                System.out.println("2) salir");
                op=sc.nextInt();
                if(op==1){
                    System.out.println("Ingrese radio ");
                  //  gc.agregarCirculo(c1); = sc.nextDouble();
 
                    //gc.agregarCirculo(c1);
                }
                
            }while(op==2);
       
      
            
        int cant=gc.getCirculos().size();

        //for (int i = 0; i < cant; i++) {
          //System.out.println(gc.getCirculos(i);
            
        }
           // System.out.println("Radio:" + circulo.calcularPer());
           // System.out.println("superficie:" + circulo.calcularSup());
        }
    //}    

   /* public static void main(String[] args) {
        
        ArrayList<Circulo> arrayList = new ArrayList<>();
        int op;
            
            do{
                System.out.println("---seleccione opcion ingresando el numero de opcion---");
                System.out.println("1) Agregar circulo ");
                System.out.println("2) salir");
                op=sc.nextInt();
                if(op==1){
                    System.out.println("Ingrese radio ");
                    double a = sc.nextDouble();
                    
                }
                
            }while(op==2);
                
            
    }*/
//}
