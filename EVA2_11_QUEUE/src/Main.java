
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Main {

    public static void main(String[] args) {
        
        Queue myQueue = new Queue();
        
        myQueue.agregar(new Nodo(100));
        myQueue.agregar(new Nodo(200));
        myQueue.agregar(new Nodo(300));
        myQueue.agregar(new Nodo(400));
        myQueue.agregar(new Nodo(500));
        myQueue.print();
        
        System.out.println("CIMA DE LA  COLA: " + myQueue.leer());
        
        try {
            myQueue.quitar();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        myQueue.print();
    }
    
}
