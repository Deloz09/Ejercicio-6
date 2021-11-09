import java.util.Random;

public class Camera extends Product{
    Random rand =  new Random();
    
    public Camera(){        
        String[] brands = {"Sony", "Canon", "Nikon"};

        this.price = 450;
        this.brand = brands[rand.nextInt(2)];
    }

    public Camera(String camera[]){
        super(camera);
    }
}
