import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {

    private List<FiguraGeometrica2D> figuras = new ArrayList<>();

    // Adiciona uma figura e retorna o índice onde foi inserida
    public int adicionaFigura(FiguraGeometrica2D fig) {
        figuras.add(fig);
        return figuras.size() - 1;
    }

    // Remove a figura na posição informada e a retorna
    public FiguraGeometrica2D removeFigura(int i) {
        if (i >= 0 && i < figuras.size()) {
            return figuras.remove(i);
        }
        throw new IndexOutOfBoundsException("Posição inválida: " + i);
    }

    // Retorna uma String com a listagem de todas as figuras
    public String listaFiguras() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < figuras.size(); i++) {
            FiguraGeometrica2D f = figuras.get(i);
            sb.append("[").append(i).append("] ")
              .append(f.tipo())
              .append(" | Área: ").append(String.format("%.2f", f.area()))
              .append(" | Perímetro: ").append(String.format("%.2f", f.perimetro()))
              .append("\n");
        }
        return sb.toString();
    }

    // Retorna a área da figura na posição i
    public double area(int i) {
        if (i >= 0 && i < figuras.size()) {
            return figuras.get(i).area();
        }
        throw new IndexOutOfBoundsException("Posição inválida: " + i);
    }

    // Retorna o perímetro da figura na posição i
    public double perimetro(int i) {
        if (i >= 0 && i < figuras.size()) {
            return figuras.get(i).perimetro();
        }
        throw new IndexOutOfBoundsException("Posição inválida: " + i);
    }

    // Retorna o tipo da figura na posição i
    public String tipo(int i) {
        if (i >= 0 && i < figuras.size()) {
            return figuras.get(i).tipo();
        }
        throw new IndexOutOfBoundsException("Posição inválida: " + i);
    }

    public int tamanho() {
        return figuras.size();
    }
}