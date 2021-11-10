import java.util.Random;
/**
 * Clase Desktop
 * Encargada de simular al desktop (computadora personal), hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

public class Desktop extends Product implements Browsable,Playable,Reproducible{
    Random rand =  new Random();
    
    
    public Desktop(){        
        String[] brands = {"HP", "Asus", "DELL"};

        this.price = 600;
        this.brand = brands[rand.nextInt(2)];
        this.type = "desktop";
        setFuncionalities();
        setRange();
    }

    public Desktop(String desktop[]){
        super(desktop);
        setFuncionalities();
        setRange();
    }

    private void  setFuncionalities(){
        this.functionalities = "1. Jugar Videojuegos\n" +
                                 "2. Reproducir Videos \n" +
                                 "3. Navegar en la Web";
    }

    private void setRange(){
        this.range = new int[]{1,3};
    }


}
