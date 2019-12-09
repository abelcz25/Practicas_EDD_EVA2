
/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Pila {
    private Nodo inicio;
    private Nodo fin;
    public Pila() {
        this.inicio = null;
        this.fin=null;
        
    }
    
    //devuelve true si la lista esta vacia
    public boolean isEmpty(){
        if (inicio == null)
            return true;
        else 
            return false;
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void Add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if (isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            /*Nodo nTemp = inicio;
            while(nTemp.getSiguiente() != null){
                nTemp = nTemp.getSiguiente();
            }
            nTemp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
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
public void addBegin(Nodo nuevo){
    if (isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
}

public void insertAt(int pos, Nodo nuevo) throws Exception{
    if (pos ==0)
        addBegin(nuevo);
    int iTama = size();
    if ((pos<0) || (pos >=iTama)){
        throw new Exception ("La posición es inválida");
        //System.out.println("La posicion es incorrecta");
    }else{
        int iCont=0;
        Nodo temp = inicio;    
        while(iCont< (pos-1)){
            iCont++;
            temp = temp.getSiguiente();
                                        
        }nuevo.setSiguiente(temp.getSiguiente());
         temp.setSiguiente(nuevo); 
}}
    
public void clear(){
    inicio = null;
    fin = null;
}
public void deleteAt(int pos) throws Exception{
     int iTama = size();
    if ((pos<0) || (pos >=iTama))
        throw new Exception ("La posición es inválida");
    if (isEmpty())
        throw new Exception ("La lista está vacía"); 
    if (iTama == 1){//solo hay un nodo
        clear();
    }else{//borrar el primer nodo
        if (pos ==0){//borrar el primer nodo
            inicio = inicio.getSiguiente();
        }
    }
    int iCont=0;
        Nodo temp = inicio;    
        while(iCont< (pos-1)){
            
            temp = temp.getSiguiente();
            iCont++;                          
        }    
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
        
        if (pos == (iTama-1))
            fin=temp;
    //omitimos la verificacion
    //Borrar la priera
    /*if (pos == 0){
        inicio=inicio.getSiguiente();
    }
    //un solo nodo
    if (inicio==null){
        clear();
    }
    
   */
    //Borrar la ultima
    
}
    public int getAt(int pos){
    Nodo temp = inicio;
    int iCont=0;
        while(iCont< (pos)){
            
        temp = temp.getSiguiente();
        iCont++;                          
            
        }return temp.getValor();
        
    }   
    
    //TAREA METODO FIND X
    
    
    //la cima es el inicio de la lista
    //agregar nodo a el inicio de la pila
    public void push (Nodo nuevo){
        addBegin(nuevo);
    }
    //lee el nodo en la cima de la pila
    public int peek(){
        return getAt(0);
    }
    //lee y quita el nodo en la cima
    public int pop() throws Exception{
        int iResu = getAt(0);
        deleteAt(0);
        
        return iResu;
    }
}
