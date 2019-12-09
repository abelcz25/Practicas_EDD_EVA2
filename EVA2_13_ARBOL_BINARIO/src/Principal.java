/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    public static void main(String[] args) {
        Arbol tree = new Arbol();
        tree.addNodo(new Nodo (13));
        tree.addNodo(new Nodo (10));
        tree.addNodo(new Nodo (18));
        tree.addNodo(new Nodo (2));
        tree.addNodo(new Nodo (17));
        tree.addNodo(new Nodo (20));
        //tree.addNodo(new Nodo (16));
        tree.imprimePostOrder();
    }
    
}
