
package ejemplo4;

import java.util.Scanner;


public class matriz {
    
    public void tabla (){
         int [][] datos  = new int [2][2];
      
            for (int i = 0; i < datos.length; i++) {
                 for (int j = 0; j < datos[i].length; j++) {
                    
                   Scanner sp = new Scanner(System.in);
                    System.out.println("ingrese numero ");
                    int num = sp.nextInt();
                    datos[i][j] =  num;
                    
                }
            }
            for (int i = 0; i < datos.length; i++){
                for (int j = 0; j < datos[i].length; j++){
                    System.out.println(i);
                    
                }
                System.out.println(); 
        
         }    
    }
      public static void main(String[] args) {
                
                matriz m = new matriz();
                 m.tabla();
                
           }
    
}
