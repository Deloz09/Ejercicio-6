import java.util.Random;
/**
 * Clase SmartTV
 * Encargada de simular al dispositivo smartTV, hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

public class SmartTV extends Product implements Reproducible, Browsable {
    Random rand =  new Random();

    public SmartTV(){        
        String[] brands = {"LG", "Samsung", "Toshiba"};

        this.price = 400;
        this.brand = brands[rand.nextInt(2)];
        this.type = "smartTV";
        setFuncionalities();
        setRange();
    }

    public SmartTV(String smarttv[]){
        super(smarttv);
        setFuncionalities();
        setRange();
    }

    private void  setFuncionalities(){
        this.functionalities = "1. Reproducir Videos \n" +
                                 "2. Navegar en la Web";
    }

    private void setRange(){
        this.range = new int[]{1,2};
    }
}
