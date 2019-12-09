
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Lista myList = new Lista();
        myList.add(new Nodo(4));
        myList.add(new Nodo(32));
        myList.add(new Nodo(123));
        myList.add(new Nodo(10));
        myList.add(new Nodo(2));
        myList.addBegin(new Nodo(9999));
        
        try {
            myList.addAt(new Nodo(101010), 2);
        } 
        catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean vacia = myList.isEmpty();
        
        if(vacia)
            System.out.println("Lista vacia");
        
        else
            System.out.println("Lista con nodos");
        
        myList.print();
        
        try {
            myList.eraseAt(0);
            myList.print();
            myList.add(new Nodo(100));
            myList.print();
            myList.eraseAt(2);
            myList.print();
            
        } catch (Exception ex) {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        System.out.println("Cantidad de elementos: " + myList.size());
        System.out.println("El valor en #2 es: " + myList.getAt(2));
    }
    
}
