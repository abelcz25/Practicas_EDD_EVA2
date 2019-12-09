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
        System.out.println(mcd(7,56));
    }
    public static int mcd (int dividendo, int divisor){
        //cuando detenemos la recursividad?
        System.out.println(dividendo + " / "+ divisor);
        if(divisor==0){
            return dividendo;
        }else {
            int iResi= dividendo % divisor;
            return mcd(divisor,iResi);
        }
    }
}
