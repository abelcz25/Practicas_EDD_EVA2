/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Queue {
    
    private Nodo inicio;
    private Nodo fin;
    
    public Queue() {
        this.inicio = null;
        this.fin = null;
    }
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    //AGREGAR NODO AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTÁ VACÍA
        if(isEmpty()){
           inicio = nuevo;
           fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void addBegin(Nodo nuevo){
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    public void print(){
        Nodo temp = inicio;
        while (temp != null) {         
            System.out.println("temp = " + temp.getValor());
            temp = temp.getSiguiente();
        }
    }
    
    public int size(){
        int cont = 0;
        Nodo temp = inicio;
        while (temp != null) {         
            temp = temp.getSiguiente();
            cont++;
        }
        return cont;
    }
    
    public void insertAt(int pos, Nodo nuevo) throws Exception{
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            int tama = size();
            if((pos<0) || (pos>= tama)){
                throw new Exception("La ´posición es inválida");
            }else{
                if(pos == 0){
                    addBegin(nuevo);
                }else{
                    Nodo temp = inicio;
                    while(pos-1 != 0){  //OTRA MANERA...
                            temp = temp.getSiguiente();
                            pos--;
                    }
                    nuevo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevo);
                }
            }
        }
    }
    
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    public void delete(int pos) throws Exception{
        //LISTA ESTA VACÍA
        if(isEmpty()){
            throw new Exception("La lista está vacía.");
        }
        
        int tama = size();
        if((pos<0) || (pos>= tama)){
            throw new Exception("La ´posición es inválida");
        }
        
        if(tama == 1){ // SÓLO UN NODO
            clear();
        }else{  //  MUCHOS NODOS
            if(pos == 0){   //  BORRAR PRIMER NODO
                inicio = inicio.getSiguiente();
            }else{
                Nodo temp = inicio;
                while(pos-1 != 0){
                        temp = temp.getSiguiente();
                        pos--;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(pos == (tama-1))
                   fin = temp;
            }
        }
    }
    
    
    public int getAt(int pos){
        //VERIFICAR si no hay nodos, si pos no es válido
        Nodo temp = inicio;
            while(pos != 0){
                    temp = temp.getSiguiente();
                    pos--;
            }
        return temp.getValor();
    }
    
                /* UNA PILA TIENE TRES
                        PEEK -->  LEER EL NODO DE LA CIMA DE LA PILA
                        PUSH -->  AGREGAR UN NODO A LA CIMA DE LA PILA
                        POP  -->  LEER Y QUITAR EL NODO DE LA CIMA DE LA PILA
                */
    
            //LA CIMA ES EL INICIO DE LA LISTA (EN ESTE CASO)
    //AGREGAR UN NODO A LA CIMA DE LA PILA
    public void agregar(Nodo nuevo){
        add(nuevo);
    }
    //LEE EL NODO EN LA CIMA DE LA PILA
    public int leer(){
        return getAt(0);
    }
    //LEE Y QUITA EL NODO DE LA CIMA DE LA PILA
    public int quitar() throws Exception{
        int resu = getAt(0);
        delete(0);
        return resu;
    }
}
