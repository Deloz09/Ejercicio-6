import java.util.Random;
/**
 * Clase Laptop
 * Encargada de simular a la laptop (computadora personal), hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

public class Laptop extends Product implements Browsable,Playable,Reproducible,Portable{
    Random rand =  new Random();
    
    
    public Laptop(){        
        String[] brands = {"HP", "Asus", "DELL"};

        this.price = 500;
        this.brand = brands[rand.nextInt(2)];
        this.type = "laptop";          
        setFuncionalities();
        setRange();
    }

    public Laptop(String laptop[]){
        super(laptop);
        setFuncionalities();
        setRange();
    }

    private void  setFuncionalities(){
        this.functionalities = "1. Portabilidad \n" +
                                 "2. Jugar Videojuegos\n" +
                                 "3. Reproducir Videos \n" +
                                 "4. Navegar en la Web";
    }

    private void setRange(){
        this.range = new int[]{1,4};
    }
}
