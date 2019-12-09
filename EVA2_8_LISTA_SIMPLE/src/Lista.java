/**
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Lista {
    private Nodo nodoIni;
    private Nodo nodoFn;
    
    public Lista(){
        this.nodoIni = null;
        this.nodoFn = null;
    }
    
    public boolean isEmpty(){ 
        if(nodoIni == null)
            return true;
        else
            return false;
    }
    
    //Agregar nodo al final
    public void add(Nodo nuevo){
        //VERIFICAR SI LA LISTA ESTA VACIA
        if(isEmpty()){
           nodoIni = nuevo;
           nodoFn = nuevo;
        }else{
         
           nodoFn.setNext(nuevo);
           nodoFn = nuevo;
        }
    }
    //AGREGAR NODO AL INICIO
    public void addBegin(Nodo nuevo){
        if(isEmpty()){
           nodoIni = nuevo;
           nodoFn = nuevo;
        }else{
           nuevo.setNext(nodoIni);
           nodoIni = nuevo;
        }
    }
    //AGREGAR EN
    public void addAt(Nodo nuevo, int posi) throws Exception{
        
        if(isEmpty()){
            nodoIni = nuevo;
            nodoFn = nuevo;
        }
        else{
            if((posi < 0) || (posi >= size()))
                throw new Exception("La posición es inválida");
            
            else{
                int cont = 0;
                Nodo temp = nodoIni;
                while(cont < (posi-1)){
                    temp = temp.getNext();
                    cont++;
            }
                
            nuevo.setNext(temp.getNext());
            temp.setNext(nuevo);
        }
        }
    }
    
    //IMPRIMIR DATOS
    public void print(){
        
        Nodo temp = nodoIni;
        
        while(temp != null){
            System.out.print(temp.getNum()+" - ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    //CANTIDAD DE NODOS 
    public int size(){
        
        int cont = 0;
        Nodo temp = nodoIni;
        
        while(temp != null){
            cont++;
            temp = temp.getNext();
        }
        
        return cont;
    }
    //VACIAR LISTA
    public void emptyList(){
        nodoFn = null;
        nodoIni = null;
    }
    
    public void eraseAt(int posi) throws Exception{
        
        if(isEmpty())
            throw new Exception("La lista está vacía");
        
        if((posi < 0) || (posi >= size()))
            throw new Exception("La posición es inválida");
        
        if(size() == 1){ 
            emptyList();
            
        }else{ 
            
            if(posi == 0){
                nodoIni = nodoIni.getNext();
            }
            else{
                Nodo temp = nodoIni;
                int cont = 0;
                while(cont < posi-1){
                    temp = temp.getNext();
                    cont++;
                }
                temp.setNext(temp.getNext().getNext());
                if(posi == (size()-1))
                    nodoFn = temp;
            }
        }
            
    }
    
    public int getAt(int posi){
        Nodo temp = nodoIni;
        int cont = 0;
        while(cont < posi){
            temp = temp.getNext();
            cont++;
        }
        return temp.getNum();
    }
    
    public int findKth(int numero) throws Exception{
        Nodo temp = nodoIni;
        int posi = 0;
        while(temp.getNum() != numero){
            temp = temp.getNext();
            if(temp == null){
                throw new Exception("El numero no existe en la lista!");
            }else
                posi++;
        }
        return posi;
    }
}
