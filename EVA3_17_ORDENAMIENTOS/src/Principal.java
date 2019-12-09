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
        int [] datos = new int[20];
        llenar(datos);
        imprimir(datos);
        long ini;
        long fn;
        /*ini = System.nanoTime();
        selectionSort(datos);
        fn = System.nanoTime();
        imprimir(datos);
        System.out.println("Tiempo: "+ (fn - ini));
        
        System.out.println("Arreglo ordenado");
        
        llenar(datos);
        imprimir(datos);
        ini = System.nanoTime();
        insertionSortPrueba(datos);
        fn = System.nanoTime();
        imprimir(datos); 
        System.out.println("Tiempo: "+ (fn - ini));
        
        llenar(datos);
        imprimir(datos);
        ini = System.nanoTime();
        bubbleSort(datos);
        fn = System.nanoTime();
        imprimir(datos); 
        System.out.println("Tiempo: "+ (fn - ini));*/
        quickSort(datos);
        imprimir(datos);
    }
    public static void llenar(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
    }
    public static void imprimir(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
    }
    //O(N^2)
    //HACE MAS COPARACIONES, Y MENOS INTERCAMBIOS
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j]<arreglo[iMin]){
                    iMin=j;
                }
            }
            //SWAP
            int iTemp = arreglo[i];
            arreglo[i] = arreglo[iMin];
            arreglo[iMin] = iTemp;
        }
    }
    
    
    //O(N^2)
    //MAS INTERCAMBIOS, PER MENOS COMPARACIONES
    
    public static void insertionSort(int [] arreglo)  {  
        int n = arreglo.length;  
        for (int i = 1; i < n; i++) {  
            int temp = arreglo[i];  
            int j = i - 1;  
            while ((j > - 1) && ( arreglo [j] > temp )) { 
                //SWAP
                arreglo[j+1] = arreglo [j];  
                j--;  
            }  
            arreglo[j+1] = temp;  
        }
    }  
    
    public static void insertionSortPrueba(int [] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int iTemp = arreglo[i];
            int insP;
            for (insP = i; insP > 0 ; insP--) {
                int iPrev = insP - 1;
                if (arreglo[iPrev]>iTemp)
                    //SWAP
                    arreglo[insP] = arreglo[iPrev];
                else 
                break;
            }
            arreglo[insP]=iTemp;
        } 
    }
    
    public static void bubbleSort(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j]> arreglo[j+1]){
                int iTemp = arreglo[i];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = iTemp;
                }
            }
        }
    }
    
    public static void quickSort(int [] arreglo){
        quickSortRec(arreglo, 0, arreglo.length - 1);
    }
        
    
    public static void quickSortRec(int [] arreglo, int ini, int fin){
        //DETENERNOS 
        if((ini < fin)&&(ini>=0)&&(fin < arreglo.length)){
            int iPiv = ini;
            int tooBig = ini + 1;
            int tooSmall = fin;
            int iTemp;
            while (tooBig < tooSmall){
                while ((tooBig < fin) && (arreglo[tooBig] < arreglo[iPiv]))
                    tooBig++;
                while ((tooSmall > ini + 1) && (arreglo[tooSmall] > arreglo[iPiv]))
                    tooSmall--;
        
                if (tooBig < tooSmall){//no se han cruzado
                    iTemp = arreglo[tooBig];
                    arreglo[tooBig] = arreglo[tooSmall];
                    arreglo[tooSmall] = iTemp;
            }
        }
        iTemp = arreglo[iPiv];
        arreglo[iPiv] = arreglo[tooSmall];
        arreglo[tooSmall] = iTemp;
        
        quickSortRec(arreglo, ini, tooSmall - 1);//IZQUIERDA
        quickSortRec(arreglo, tooSmall + 1, fin);//DERECHA
            
        }
        
        
    }
}
