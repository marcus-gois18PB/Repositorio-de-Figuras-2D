

public class Circulo implements FiguraGeometrica2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;

    }

    public double getRaio(double raio){
        return raio;
   }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2) 
    }

    @Override
    public double perimetro() {
        return 2* Math.PI * raio;
        
    }
    @Override 
    public String getTipo() {
       return "Circulo";
    }
   
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}