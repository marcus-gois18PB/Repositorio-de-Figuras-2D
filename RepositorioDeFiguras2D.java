import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioDeFiguras2D {
    List<FiguraGeometrica2D> FiguraGeometricas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public double adicionaFigura(double area, double perimetro){
    FiguraGeometrica2D figuranova2D = new FiguraGeometrica2D() {

        @Override
        public double area() {
            return 0;
        }

        @Override
        public double perimetro() {
            return 0;
        }
    };
        return 0;
         }


     public int removeFigura(int indice) {
    if (indice <= 0 && indice < FiguraGeometricas.size()) {
        FiguraGeometricas.remove(indice);


    }

         return 0;
     }
     public String MostrarFiguras(String Buscar){
         for (FiguraGeometrica2D a : FiguraGeometricas){

     }
return null;}
     }










