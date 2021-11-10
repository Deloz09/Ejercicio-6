import java.util.Random;
/**
 * Clase SmartPhone
 * Encargada de simular al dispositivo smartphone, hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

public class Smartphone extends Product implements Callable, Reproducible, Photographable, Portable, Browsable{
    Random rand =  new Random();

    public Smartphone(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 200;
        this.brand = brands[rand.nextInt(2)];
        this.type = "smartphone";
        setFuncionalities();
        setRange();
    }

    public Smartphone(String smartp[]){
        super(smartp);
        setFuncionalities();
        setRange();
    }

    private void  setFuncionalities(){
        this.functionalities = "1. Portabilidad \n" +
                                 "2. Hacer llamada \n" +
                                 "3. Reproducir Videos \n" +
                                 "4. Navegar en la Web \n" +
                                 "5. Tomar Foto";
    }

    private void  setRange(){
        this.range = new  int[]{1,5} ;
    }

}
