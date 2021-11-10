import java.util.Random;

public class Smartphone extends Product implements Callable, Reproducible, Photographable, Portable, Browsable{
    Random rand =  new Random();

    public Smartphone(){        
        String[] brands = {"Apple", "Samsung", "Huawei"};

        this.price = 200;
        this.brand = brands[rand.nextInt(2)];
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
