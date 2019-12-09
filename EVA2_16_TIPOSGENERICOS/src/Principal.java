/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo <String> nodo = new Nodo<String>();
        nodo.setValor("Hola mundo cruel!!");
    }
    
}
class Nodo<T>{
    private T valor;
    Nodo sig;
    Nodo prev;
    public Nodo(){
        this.sig=null;
        this.prev=null;     
    }
    public Nodo (T valor){
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
    
}
