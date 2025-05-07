import java.util.Vector;

public class Pilha <T> {
    private T[] elementos;
    private int topo;

    public Pilha () {
        elementos = (T[]) new Object[10];
        topo = -1;
    }

    public boolean empty () {
        return topo == -1;
    }

    public T peek () {
        if (topo == -1) {
            return null;
        }
        else {
            return elementos[topo];
        }
    }

    public T pop () {
        if (topo == -1) {
            return null;
        }
        else {
            T elemento = elementos[topo];
            topo--;
            return elemento;
        }
    }
        public T push (T elemento) {
        if (topo == elementos.length - 1) {
            T[] novoArray = (T[]) new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, novoArray, 0, elementos.length);
            elementos = novoArray;
        }
        elementos[++topo] = elemento;
        return elemento;
    }
    
    public boolean search (T elemento) {
        for (int i = topo; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        if (empty()) {
            System.out.println("pilha zerada");
        } else {
            System.out.print("[");
            for (int i = topo; i >= 0; i--) {
                System.out.print(elementos[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public void clear() {
        topo = -1;
    }
}
