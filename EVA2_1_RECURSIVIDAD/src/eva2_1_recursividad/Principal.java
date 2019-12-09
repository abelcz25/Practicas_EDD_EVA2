package eva2_1_recursividad;

import java.util.Scanner;

/**
 *
 * @author Abel Johany Cazares Amparan
 *          18550400
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sInput = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int iVal = sInput.nextInt();
        int iVal2=1;
        for (int i=iVal; i>=1;i--){
            System.out.print(i+"-");
        }   System.out.println("\n");
       
       forFalso(iVal);
        System.out.println("");
        
        invFor(iVal);
    }
    public static void forFalso(int iVal){        
            System.out.print(iVal+"-");
            if (iVal>=1)
            forFalso(iVal-1);
        }
    
    public static void invFor(int iVal){  
            
            if (iVal<=1){
              forFalso(iVal-iVal+1);
            }
            
        }
}
