
import java.util.Scanner;
/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iVal = sCaptu.nextInt();
        System.out.println("Valor final: " + calcFactorial(iVal)); 
    }
    
    public static int calcFactorial(int iVal){
        System.out.println("Inicio: " + iVal);
        if (iVal == 0) {
        return 1; //Termina metodo   
        }
        return iVal * calcFactorial(iVal - 1);
        
    }
    
}
