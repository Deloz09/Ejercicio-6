import java.util.ArrayList;

class Controlador{    

    public static void main(String[] args){
       // menu();    
        init();
    }

    public static void init(){
        ArrayList<String[]> data = new ArrayList<String[]>();
        data  = ReadAndWrite.read();
        Product.setCounter(Integer.parseInt(data.get(0)[0]));

        for(int i = 1; i < data.size(); i++){
            if(data.get(i)[5].equals("smartphone")){
                Smartphone smartPhone = new Smartphone(data.get(i));
                Cart.addProduct(smartPhone);
                System.out.println(smartPhone.objectToString());

            }else if(data.get(i)[5].equals("cellphone")){
                CellPhone cellPhone = new CellPhone(data.get(i));
                Cart.addProduct(cellPhone);

            }else if(data.get(i)[5].equals("linephone")){
                LinePhone linePhone = new LinePhone(data.get(i));
                Cart.addProduct(linePhone);

            }else if(data.get(i)[5].equals("camera")){
                Camera camera = new Camera(data.get(i));
                Cart.addProduct(camera);

            }else if(data.get(i)[5].equals("laptop")){
                Laptop laptop = new Laptop(data.get(i));
                Cart.addProduct(laptop);

            }else if(data.get(i)[5].equals("smartTV")){
                SmartTV smartTV = new SmartTV(data.get(i));
                Cart.addProduct(smartTV);

            }else if(data.get(i)[5].equals("Tablet")){
                Tablet tablet = new Tablet(data.get(i));
                Cart.addProduct(tablet);

            }else if(data.get(i)[5].equals("smartwatch")){
                Smartwatch smartwatch = new Smartwatch(data.get(i));
                Cart.addProduct(smartwatch);

            }else if(data.get(i)[5].equals("desktop")){
                //Desktop desktop = new Desktop(data.get(i));

            }
        }

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