
import java.util.LinkedList;
/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> lLinkList = new LinkedList<String>();
        lLinkList.add("Hola");
        lLinkList.add("");
        lLinkList.add("mundo");
        lLinkList.add("");
        lLinkList.add("cruel");
        lLinkList.add("!!!");
        lLinkList.addFirst("XXXXX");
        System.out.println(lLinkList);
        for (String string : lLinkList) {
            System.out.print(string +" - ");
        }
        System.out.println("");
        System.out.println("Hay " + lLinkList.size()+" elementos");
        
        lLinkList.remove(3);
        System.out.println("Hay " + lLinkList.size()+" elementos");
    }
    
}
class Algo{
    
}