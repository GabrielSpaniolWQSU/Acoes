public class Pilha {

    // array para guardar as ações
    private static String[] pilha;
    // topo da pilha
    private static int topo;

    // construtor
    public Pilha(int tamanho) {
        pilha = new String[tamanho];
        topo = 0;
    }

    // inserir ação (push)
    public static void push(String acao) {
        if (!full()) {
            pilha[topo] = acao;
            topo++;
            System.out.println("Ação adicionada: " + acao);
        } else {
            System.out.println("Erro: Pilha cheia!");
        }
    }

    // desfazer ação (pop)
    public static String pop() {
        if (!empty()) {
            String acao = pilha[size() - 1];
            pilha[size() - 1] = null;
            topo--;
            System.out.println("Desfazendo ação: " + acao);
            return acao;
        }

        System.out.println("Erro: Pilha vazia!");
        return null;
    }

    // ver ação do topo (sem remover)
    public static String stacktop() {
        if (!empty()) {
            return pilha[size() - 1];
        }

        System.out.println("Pilha vazia!");
        return null;
    }

    // tamanho atual
    public static int size() {
        return topo;
    }

    // pilha vazia
    public static boolean empty() {
        return topo <= 0;
    }

    // pilha cheia
    public static boolean full() {
        return topo == pilha.length;
    }

    // listar ações
    public static void display() {
        if (empty()) {
            System.out.println("Nenhuma ação disponível.");
        } else {
            System.out.println("Ações disponíveis para desfazer:");
            for (int i = topo - 1; i >= 0; i--) {
                System.out.println("- " + pilha[i]);
            }
        }
    }
}