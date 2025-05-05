public class App {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        // Testa o método empty()
        System.out.println("Pilha vazia? " + pilha.empty());

        // Adiciona elementos à pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Testa o método print()
        pilha.print();

        // Testa o método peek()
        System.out.println("Elemento no topo: " + pilha.peek());

        // Testa o método pop()
        System.out.println("Elemento removido: " + pilha.pop());

        // Testa o método print() novamente
        pilha.print();

        // Testa o método search()
        System.out.println("Elemento 20 encontrado? " + pilha.search(20));

        // Testa o método erase()
        pilha.clear();

        // Testa o método empty() novamente
        System.out.println("Pilha vazia? " + pilha.empty());

        // Testa o método print() novamente
        pilha.print();
    }
}