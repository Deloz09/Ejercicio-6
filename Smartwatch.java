import java.util.Random;
/**
 * Clase SmartWatch
 * Encargada de simular al dispositivo smartwatch, hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 
public class Smartwatch extends Product implements Photographable, Portable, Callable {
    Random rand =  new Random();
    
    public Smartwatch(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 150;
        this.brand = brands[rand.nextInt(2)];
        this.type = "smartwatch";
        setFuncionalities();
        setRange();
    }

    public Smartwatch(String smartw[]){
        super(smartw);
        setFuncionalities();
        setRange();
    }

    private void  setFuncionalities(){
        this.functionalities =  "1. Portar \n" +
                                 "2. Tomar Foto \n" +
                                 "3. Hacer llamada";
    }

    private void setRange(){
        this.range = new int[]{1,3};
    }
}
