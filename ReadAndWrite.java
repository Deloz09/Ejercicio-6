import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndWrite {

    /**
     * Lee la informacion en el  archivo txt
     * El primer numero debe ser el  valor del contador 
     * @return devuelve un array de Strings con los valores correspondientes
     */
    public static String[] read(){
        Scanner scan = findFile();
        String[] data = null;

        if(scan.hasNext()){
            String line = scan.next();
            data = line.split(",");

        }
        return data;
    }



    /**
     * Metodo que encuentra el archivo que se quiere leer
     * @return devuelve el scanner del archivo
     */
    private static Scanner findFile(){
        File file = null;
        Scanner scan = null;

        
        try{
            file = new File("./Ab DataCart.txt");
            scan  = new Scanner(file);
            
        }catch(FileNotFoundException e){
            System.out.println("El archivo no se encontro");
            System.exit(1);
        }

        return scan;
    }



    /**
     * Metodo que escribe un string
     * @param str String que se pone en el archivo
     */
    public static void writer(String str) {
        FileWriter writer  = null;
        
        try{
            writer = makeWriter();
            writer.write(str);
        }catch(IOException e){
            System.out.println("El archivo no se encontro");
            System.exit(1);
        }
      
    
    }


    /**
     * Encuentra el archivo e instancia el  FileWriter
     * @return
     */
    private static FileWriter makeWriter()throws IOException{

        File file = new File("./Ab DataCart.txt");
        FileWriter writer = new FileWriter(file);

        return writer;
    }
    
}
