import java.util.Random;

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
