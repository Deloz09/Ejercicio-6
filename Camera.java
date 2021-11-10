import java.util.Random;
/**
 * Clase Camera
 * Encargada de simular al dispositivo camara, hereda de Product
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */
public class Camera extends Product implements Photographable, Reproducible, Portable{
    Random rand =  new Random();
    
    public Camera(){        
        String[] brands = {"Sony", "Canon", "Nikon"};

        this.price = 450;
        this.brand = brands[rand.nextInt(2)];
        this.type = "camera";
        setFuncionalities();
        setRange();
    }

    public Camera(String camera[]){
        super(camera);
        setFuncionalities();
        setRange();
    }

    private void setFuncionalities(){
        this.functionalities = "1. Tomar Foto \n" + 
                                "2. Reproducir Video \n" +
                                "3. Portable \n";
    }

    private void setRange(){
        this.range  = new int[]{1,3};
    }
}
