/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Arbol {
    private Nodo root;

    public Arbol() {
        root = null;
    }
    
    public void addNodo(Nodo nuevo){
        addNodoRec(root, nuevo);
    }
    
    public void addNodoRec(Nodo act, Nodo nuevo){
        if (root == null){ //ARBOL VACIO
            root = nuevo;
        } else{
            if (nuevo.getValor() > act.getValor()){ //mayor --> A LA DERECHA
                if (act.getDer() == null){ //VACIO,  HAY ESPACIO
                    act.setDer(nuevo);
                }else{
                    addNodoRec(act.getDer(), nuevo );
                }
            }else if(nuevo.getValor() < act.getValor()){ // MENOR -->A LA IZQUIERDA
                if (act.getIzq() == null){ //VACIO,  HAY ESPACIO
                    act.setIzq(nuevo);
                }else{
                    addNodoRec(act.getIzq(), nuevo);
                }
            }else if (nuevo.getValor() == act.getValor()){ //EL VALOR ES IGUAL
                System.out.println("UPS! YA EXISTE EL VALOR");
                
            }
        }
    }
    
    public void imprimePostOrder(){
        postOrder(root);
    }
    
    private void postOrder(Nodo act){
        if (act != null){
        //LEER IZQ
        postOrder(act.getIzq());
        //LEER DER
        postOrder(act.getDer());
        //IMPRIMIR
        System.out.print(act.getValor() + "");
        }
    }
}
