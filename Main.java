import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aviao aviao = new Aviao("Boeing 767", "Data do avião: 11/09"); 

        while (true) {
            System.out.println("Vamos alugar um avião para ir para TORRES no dia 11/09");
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Exibir Lugares Ocupados");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Passageiro: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número do Cartão: Idosos e VIPS - Grupo 1 e 2. Restantes - Grupo 3 e 4");
                    String numeroCartao = scanner.nextLine();
                    System.out.print("Categoria (Economica/Executiva): ");
                    String categoriaNome = scanner.nextLine();
                    System.out.print("Número do Assento (1-20): ");
                    int numeroAssento = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    
                    Categoria categoria = new Categoria(categoriaNome, numeroAssento);
                    Passageiro passageiro = new Passageiro(nome, new Cartao(numeroCartao));
                    
                    if (aviao.adicionarPassageiro(categoria, passageiro)) {
                        System.out.println("Passageiro adicionado com sucesso!");
                    } else {
                        System.out.println("Não foi possível adicionar o passageiro. Assento já ocupado ou categoria inválida.");
                    }
                    break;
                case 2:
                    aviao.exibirLugaresOcupados();
                    break;
                case 3:
                    System.out.println("Fechando o programa");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
