/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo1 = new Nodo(32);
        Nodo nodo2 = new Nodo(17);
        Nodo nodo3 = new Nodo(5);
        
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);     
        
        System.out.println(nodo1.getValor());
        System.out.println(nodo1.getSiguiente().getValor());
        System.out.println(nodo1.getSiguiente().getSiguiente().getValor());
        
        Nodo temp = nodo1;
        while(temp != null){
            System.out.print(temp.getValor()+" - ");
            temp = temp.getSiguiente();
        }
    }    
}

class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }    
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
