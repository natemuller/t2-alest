import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        int[] elementos = {
            0x42, 0x64, 0x58, 0x4c, 0x4b, 0x4a, 0x48, 0x61, 0x4b, 0x68, 0x6a, 0x4e, 0x4e, 0x70, 0x56, 0x65, 0x34,
            0x4a, 0x6c, 0x61, 0x31, 0x4a, 0x6b, 0x55, 0x7a, 0x67, 0x6b, 0x56, 0x6f, 0x68, 0x44, 0x62, 0x71, 0x64, 
            0x54, 0x33, 0x39, 0x47, 0x62, 0x79, 0x78, 0x6b, 0x63, 0x30, 0x64, 0x45, 0x55, 0x59, 0x46, 0x54, 0x61, 
            0x70, 0x39, 0x32, 0x4e, 0x7a, 0x46, 0x46, 0x65, 0x72, 0x56, 0x57, 0x62, 0x33, 0x70, 0x55, 0x63, 0x73, 
            0x5a, 0x46, 0x57, 0x4d, 0x39, 0x31, 0x51, 0x66, 0x70, 0x6c, 0x65, 0x70, 0x4a, 0x6c, 0x52, 0x4f, 0x68, 
            0x56, 0x4c, 0x46, 0x42, 0x7a, 0x54, 0x4f, 0x35, 0x47, 0x53, 0x4a, 0x6c, 0x33, 0x54, 0x74, 0x49, 0x6b, 
            0x5a, 0x6e, 0x46, 0x55, 0x61, 0x6b, 0x4a, 0x48, 0x55, 0x35, 0x48, 0x53, 0x49, 0x64, 0x6b, 0x54, 0x31, 
            0x63, 0x7a, 0x5a, 0x4c, 0x35, 0x55, 0x56, 0x34, 0x6c, 0x44, 0x57, 0x6a, 0x31, 0x69, 0x61, 0x69, 0x52, 
            0x6a, 0x59, 0x32, 0x4d, 0x6e, 0x56, 0x61, 0x68, 0x6b, 0x4e, 0x31, 0x68, 0x6a, 0x51, 0x42, 0x5a, 0x6b, 
            0x4d, 0x6c, 0x4d, 0x58, 0x4c, 0x7a, 0x4e, 0x57, 0x4c, 0x7a, 0x31, 0x47, 0x63, 0x6e, 0x5a, 0x5a, 0x6b, 
            0x4d, 0x6c, 0x30, 0x32, 0x62, 0x6a, 0x35, 0x43, 0x64, 0x75, 0x56, 0x47, 0x64, 0x75, 0x39, 0x32, 0x59,
            0x79, 0x56, 0x32, 0x63, 0x31, 0x56, 0x47, 0x62, 0x6e, 0x39 
        };

        // Cria uma pilha com os elementos do array
        for (int i = 0; i < elementos.length; i++) {
            pilha.push(elementos[i]);
        }
        // Testa o método empty()
        System.out.println("Pilha vazia? " + pilha.empty());

        // Adiciona elementos à pilha


        // Testa o método print()
        pilha.print();

        // Testa o método peek()
        System.out.println("Elemento no topo: " + pilha.peek());

        // Testa o método pop()
        System.out.println("Elemento removido: " + pilha.pop());

        // Testa o método print() novamente
        pilha.print();

        // Testa o método search()
        System.out.println("Elemento 110 encontrado? " + pilha.search(110));

        // Testa o método erase()
        pilha.clear();

        // Testa o método empty() novamente
        System.out.println("Pilha vazia? " + pilha.empty());

        // Testa o método print() novamente
        pilha.print();
    }
}