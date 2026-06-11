import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Defina o tamanho da pilha: ");
        int tamanho = sc.nextInt();
        sc.nextLine(); // limpar buffer

        // cria a pilha
        new Pilha(tamanho);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir ação");
            System.out.println("2 - Desfazer última ação");
            System.out.println("3 - Listar ações");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a ação: ");
                    String acao = sc.nextLine();
                    Pilha.push(acao);
                    break;

                case 2:
                    Pilha.pop();
                    break;

                case 3:
                    Pilha.display();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}