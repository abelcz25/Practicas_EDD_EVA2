/**
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Nodo {
     private int num;
    private Nodo next;

    public Nodo(){
        this.next = null;
    }
    public Nodo(int val){
        this.num = val;
        this.next = null;
    }
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }  
}
