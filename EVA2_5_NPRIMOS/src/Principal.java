
import java.util.Scanner;
/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    public static void main(String[] args) {
                
        Scanner n = new Scanner(System.in);
        System.out.println("introduce un numero");
        int N=n.nextInt();
        esPrimoIneficiente(N);
        /*if (esPrimoIneficiente(N)==true){
            System.out.println("Es primo");
        }else System.out.println("No es primo");
        */
    }
    public static boolean esPrimoIneficiente(int valor){
        boolean bRes = true;
        for (int i = 2; i<valor;i++){
            if ((valor%i)==0)
                bRes=false;
                break;
        }return bRes;
    }
}
