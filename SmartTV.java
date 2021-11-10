import java.util.Random;

public class SmartTV extends Product implements Reproducible, Browsable {
    Random rand =  new Random();

    public SmartTV(){        
        String[] brands = {"LG", "Samsung", "Toshiba"};

        this.price = 400;
        this.brand = brands[rand.nextInt(2)];
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
