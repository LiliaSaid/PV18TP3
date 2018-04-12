
import java.util.Scanner;


public class testpto1 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Punto p =new Punto();
        double x1,y1,x2,y2;
        System.out.println("Ingrese coordenadas x1 enter y luego y1 del primer punto: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Ingrese coordenadas x2 enter y luego y2 del segundo punto: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        double s = p.getDistancia(x1, y1, x2, y2);
        System.out.println("la distancia es " + s);
        
        
    }
    
}
