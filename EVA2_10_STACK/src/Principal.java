/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {
    public static void main(String[] args) {
        
        Pila miPila = new Pila();
        
        miPila.push(new Nodo (100));
        miPila.push(new Nodo (200));
        miPila.push(new Nodo (300));
        miPila.push(new Nodo (400));
        
        miPila.print();
        System.out.println("CIMA DE LA PILA ");
        
        
    
      }       
    
}
