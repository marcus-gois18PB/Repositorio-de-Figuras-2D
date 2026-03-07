import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioDeFiguras2D repositorio = new RepositorioDeFiguras2D();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- Repositório de Figuras 2D ---");
            System.out.println("1. Adicionar Círculo");
            System.out.println("2. Adicionar Quadrado");
            System.out.println("3. Listar todas as figuras (Área e Perímetro)");
            System.out.println("4. Remover figura pela posição");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                
                // Polimorfismo: A interface FiguraGeometrica2D aponta para um Círculo
                FiguraGeometrica2D novaFigura = new Circulo(raio);
                repositorio.adicionaFigura(novaFigura);
                System.out.println("Círculo adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                
                // Polimorfismo: A mesma interface agora aponta para um Quadrado
                FiguraGeometrica2D novaFigura = new Quadrado(lado);
                repositorio.adicionaFigura(novaFigura);
                System.out.println("Quadrado adicionado com sucesso!");

            } else if (opcao == 3) {
                int total = repositorio.getQuantidadeDeFiguras();
                if (total == 0) {
                    System.out.println("O repositório está vazio.");
                } else {
                    System.out.println("\n--- Lista de Figuras ---");
                    for (int i = 0; i < total; i++) {
                        // O polimorfismo acontece lá dentro do repositório!
                        // Não precisamos saber se é círculo ou quadrado para pedir a área.
                        String tipo = repositorio.recuperarTipo(i);
                        double area = repositorio.recuperarArea(i);
                        double perimetro = repositorio.recuperarPerimetro(i);

                        // Imprimindo os dados formatados
                        System.out.printf("Posição %d: %s | Área: %.2f | Perímetro: %.2f\n", 
                                          i, tipo, area, perimetro);
                    }
                }

            } else if (opcao == 4) {
                System.out.print("Digite a posição da figura que deseja remover: ");
                int posicao = scanner.nextInt();
                repositorio.removeFigura(posicao);
                System.out.println("Comando de remoção executado.");

            } else if (opcao == 5) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
