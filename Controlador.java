import java.util.ArrayList;
import java.util.Random;
/**
 * Clase Controlador
 * Encargada de ejecutar el programa, llevar a cabo la seleccion de opciones, comunicarse con las
 * demás clases y sus respectivos procesos.
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

class Controlador{    
    static Random rand = new Random();

    public static void main(String[] args){       
        init();
        menu();
    }

    public static void init(){
        ArrayList<String[]> data = new ArrayList<String[]>();
        data  = ReadAndWrite.read();
        Product.setCounter(Integer.parseInt(data.get(0)[0]));

        for(int i = 1; i < data.size(); i++){
            if(data.get(i)[0].equals("smartphone")){
                Smartphone smartPhone = new Smartphone(data.get(i));
                Cart.addProduct(smartPhone);                

            }else if(data.get(i)[0].equals("cellphone")){
                CellPhone cellPhone = new CellPhone(data.get(i));
                Cart.addProduct(cellPhone);

            }else if(data.get(i)[0].equals("linephone")){
                LinePhone linePhone = new LinePhone(data.get(i));
                Cart.addProduct(linePhone);

            }else if(data.get(i)[0].equals("camera")){
                Camera camera = new Camera(data.get(i));
                Cart.addProduct(camera);

            }else if(data.get(i)[0].equals("laptop")){
                Laptop laptop = new Laptop(data.get(i));
                Cart.addProduct(laptop);

            }else if(data.get(i)[0].equals("smartTV")){
                SmartTV smartTV = new SmartTV(data.get(i));
                Cart.addProduct(smartTV);

            }else if(data.get(i)[0].equals("Tablet")){
                Tablet tablet = new Tablet(data.get(i));
                Cart.addProduct(tablet);

            }else if(data.get(i)[0].equals("smartwatch")){
                Smartwatch smartwatch = new Smartwatch(data.get(i));
                Cart.addProduct(smartwatch);

            }else if(data.get(i)[5].equals("desktop")){
                Desktop desktop = new Desktop(data.get(i));
                Cart.addProduct(desktop);

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
                    Vista.displayCart(Cart.getProducts());;
                    break;
                case 3:
                    Vista.printReceipt(Vista.askUser(), Vista.askNit(), Product.makeFabDate(), (rand.nextInt(300) + 100));
                    break;
                case 4: 
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
                    Smartphone smartphone = new Smartphone();
                    switch(Vista.functionalityMenu(smartphone.getRange(), smartphone.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(smartphone.toCarry());
                            break;
                        case 2:
                            Vista.displayMessage(smartphone.toCall(Vista.askPhone()));
                            break;
                        case 3: 
                            Vista.displayMessage(smartphone.toReproduce());
                            break;
                        case 4:
                            smartphone.toBrowse(Vista.askString("Ingrese el nombre de una pagina: "));
                            break;
                        case 5:
                            Vista.displayMessage(smartphone.toPhotograph());
                        
                    }
                    break;

                case 2:
                    CellPhone cellphone = new CellPhone();
                    switch(Vista.functionalityMenu(cellphone.getRange(), cellphone.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(cellphone.toCall(Vista.askPhone()));
                            break;
                        case 2:
                            Vista.displayMessage(cellphone.toCarry());
                            break;
                    }
                    break;

                case 3: 
                    LinePhone linePhone = new LinePhone();
                    switch(Vista.functionalityMenu(linePhone.getRange(), linePhone.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(linePhone.toCall(Vista.askPhone()));
                            break;
                    }
                    break;

                case 4:
                    Camera camera = new Camera();
                    switch(Vista.functionalityMenu(camera.getRange(), camera.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(camera.toPhotograph());
                            break;
                        case 2:
                            Vista.displayMessage(camera.toReproduce());
                            break;
                        case 3:
                            Vista.displayMessage(camera.toCarry());
                            break;
                    }
                    break;

                case 5:
                    Desktop desktop = new Desktop();    
                    switch(Vista.functionalityMenu(desktop.getRange(), desktop.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(desktop.toPlay());
                            break;
                        case 2:
                            Vista.displayMessage(desktop.toReproduce());
                            break;
                        case 3:
                            Vista.displayMessage(desktop.toBrowse(Vista.askString("Ingrese el nombre de una pagina: ")));
                    }                
                    break;

                case 6:
                    Laptop laptop = new Laptop();
                    switch(Vista.functionalityMenu(laptop.getRange(), laptop.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(laptop.toCarry());
                            break;
                        case 2:
                            Vista.displayMessage(laptop.toPlay());
                            break;
                        case 3:
                            Vista.displayMessage(laptop.toReproduce());
                            break;
                        case 4:
                            Vista.displayMessage(laptop.toBrowse(Vista.askString("Ingrese el nombre de una pagina: ")));
                    }
                    break;

                case 7: 
                    SmartTV smartTV = new SmartTV();
                    switch(Vista.functionalityMenu(smartTV.getRange(), smartTV.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(smartTV.toReproduce());
                            break;
                        case 2:
                            Vista.displayMessage(smartTV.toBrowse(Vista.askString("Ingrese el nombre de una pagina: ")));
                            break;
                    }
                    break;

                case 8:
                    Tablet tablet =  new Tablet();
                    switch(Vista.functionalityMenu(tablet.getRange(), tablet.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(tablet.toCarry());
                            break;
                        case 2:
                            Vista.displayMessage(tablet.toBrowse(Vista.askString("Ingrese el nombre de una pagina: ")));
                            break;
                        case 3:
                            Vista.displayMessage(tablet.toReproduce());
                            break;
                        case 4:
                            Vista.displayMessage(tablet.toPhotograph());
                            break;
                    }
                    break;

                case 9:
                    Smartwatch smartwatch = new Smartwatch();
                    switch(Vista.functionalityMenu(smartwatch.getRange(), smartwatch.getFunctionalities())){
                        case 1:
                            Vista.displayMessage(smartwatch.toCarry());
                            break;
                        case 2:
                            Vista.displayMessage(smartwatch.toPhotograph());
                            break;
                        case 3:
                            Vista.displayMessage(smartwatch.toCall(Vista.askPhone()));
                            break;                            
                    }
                    break;

                case 10:
                    condicion = false;                    
                    break;
            }
        }
    }

    public static void displayFunctionality(int option){
        switch(option){
            case 1:                 
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