import java.util.Objects;

public class Quadrado implements FiguraGeometrica2D {

    private double lado;

    public Quadrado(double lado) {
         this.lado = lado;

    }
    public double getLado(double lado){
        return lado;
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quadrado quadrado = (Quadrado) o;
        return Double.compare(getLado(), quadrado.getLado()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLado());
    }
}
