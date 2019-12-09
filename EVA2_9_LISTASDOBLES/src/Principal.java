/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {
   
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble miLista = new ListaDoble();
        miLista.Add(new Nodo(100));
        miLista.Add(new Nodo(200));
        miLista.Add(new Nodo(300));
        miLista.Add(new Nodo(400));
        miLista.print();
        System.out.println("");
        miLista.printBack();
        
    }
    
}
