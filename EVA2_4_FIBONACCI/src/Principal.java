
import java.util.Scanner;
/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuántas posiciones quieres leer?");
        int hi = s.nextInt();
        s.nextLine();
        System.out.println(fibo(0,1,0,hi));
        
    }
    public static int fibo(int f, int s,int r, int i){
        System.out.println(r);
        if (i!=0){
            r=f+s;
            i--;
            return  fibo (s,r,s,i);
        }else{
            return r;
        }
    }
}
