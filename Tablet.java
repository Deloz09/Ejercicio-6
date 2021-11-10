import java.util.Random;
/**
 * Clase Tablet
 * Encargada de simular al dispositivo tablet, hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 
public class Tablet extends Product implements Portable, Browsable, Reproducible,  Photographable{
    Random rand =  new Random();
    
    public Tablet(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 150;
        this.brand = brands[rand.nextInt(2)];
        this.type = "tablet";
        setFuncionalities();
        setRange();
    }

    public Tablet(String tablet[]){
        super(tablet);
        setFuncionalities();
        setRange();
    }

    private void setFuncionalities(){
        functionalities = "1. Portable \n" +
                            "2. Navegar por el internet \n" +
                            "3. Reproducible \n" +
                            "4. Tomar  Foto \n";
    }

    private void setRange(){
        this.range = new int[]{1,4};
    }
}
