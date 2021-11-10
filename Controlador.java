class Controlador{    

    public static void main(String[] args){
       // menu();    
        ReadAndWrite.read();
    }

    public static void init(){
        

    }


    public static void exit(){

        String num = String.valueOf(Product.getCounter());
        ReadAndWrite.writer(num);

        for (Product product : Cart.getProducts()) {            
            ReadAndWrite.writer(product.objectToString());
        }
    }

    public static void menu(){
        boolean condicion = true;
        while(condicion){
            switch(Vista.mainMenu()){
                case 1:
                    store();
                    break;
                case 2:
                    break;
                case 3: 
                    exit();
                    condicion = false;
                    break;
            }
        }
    }

    public static void store(){
        boolean condicion = true;
        while(condicion){
            switch(Vista.displayStore()){
                case 1:
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7: 
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    condicion = false;
                    break;
            }
        }
    }

    public static void displayFunctionality(int option){
        switch(option){
            case 1: // Portable                
                break;
            case 2: // Reproducir Video
                break;
            case 3: // Fotografeable
                break;
            case 4: // Llamable
                break;
            case 5: // Navegable
            

        }

    }
}