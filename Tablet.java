import java.util.Random;

public class Tablet extends Product implements Portable, Browsable, Reproducible,  Photographable{
    Random rand =  new Random();
    
    public Tablet(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 150;
        this.brand = brands[rand.nextInt(2)];
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
