
public class Punto {
    private double distancia;

    public double getDistancia() { 
        return distancia;
    }
    
    public void setDistancia(double x1,double y1,double x2,double y2) {
        this.distancia =Math.hypot(x2-x1, y2-y1);
    }
    
    
}
