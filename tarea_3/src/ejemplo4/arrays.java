package ejemplo4;
import ejemplo4.alumnos;
import java.util.ArrayList;
import java.util.Scanner;



public class arrays {
    
    
    int array [] = new int [4];
    
    public static void main(String[] args) {
        ArrayList<alumnos> lista = new ArrayList<>();
        lista.add(new alumnos(2000001, "marvin",25,"semestre 2"));
        lista.add(new alumnos(2000201, "jose",24,"semestre 3"));
        lista.add(new alumnos(2040001, "pablo",25,"semestre 5"));
        lista.add(new alumnos(2020201, "maria",24,"semestre 1"));
        lista.add(new alumnos(2003001, "paola",25,"semestre 4"));
        
              // por su medida 
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).nombre);
            System.out.println(lista.get(i).carne);
        }
  
        
        
        //for each
        for (alumnos sp : lista) {
            System.out.println(sp.carne);
            
        }
    }   
    
}
