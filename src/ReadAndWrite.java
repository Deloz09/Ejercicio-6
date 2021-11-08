import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndWrite {
    public static void read(){
        Scanner scan = findFile();

        while (scan.hasNext()){
            System.out.println(scan.next());
        }

    }





    /**
     * Metodo que encuentra el archivo que se quiere leer
     * @return devuelve el scanner del archivo
     */
    private static Scanner findFile(){
        File file = null;
        Scanner scan = null;

        
        try{
            file = new File("/Users/gustavogonzalez/Desktop/Coding/JavaCode/Ejercicio-6/src/data.txt");
            scan  = new Scanner(file);
            
        }catch(FileNotFoundException e){
            System.out.println("El archivo no se encontro");
        }

        return scan;
    }
    
}
