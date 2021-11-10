import java.util.Random;

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
