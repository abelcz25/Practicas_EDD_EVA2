/**
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    public ListaDoble() {
        this.inicio = null;
        this.fin=null;
    }
    public boolean isEmpty(){
        if (inicio == null)
            return true;
        else 
            return false;
    }
    public void Add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if (isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            
            fin.setSiguiente(nuevo); //HACIA ADELANTE
            nuevo.setPrevio(fin); //HACIA ATRAS           
            fin = nuevo;
        }
    }
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor()+" - ");
            temp = temp.getSiguiente();
        }
    }  
    public int size(){
        Nodo temp = inicio;
        int iCont=0;
            while(temp != null){
                iCont++;
                temp = temp.getSiguiente();
            }
        return iCont;
    } 
    public void clear(){
    inicio = null;
    fin = null;
    }
    public int getAt(int pos){
        Nodo temp = inicio;
        int iCont=0;
            while(iCont< (pos)){            
                temp = temp.getSiguiente();
                iCont++;                                     
            }return temp.getValor();       
    }   
    public void printBack(){
        Nodo temp = fin;
        while(temp != null){
            System.out.print(temp.getValor()+" - ");
            temp = temp.getPrevio();
        }
    }  
}
