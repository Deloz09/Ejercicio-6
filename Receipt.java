/**
 * Clase Receipt
 * Encargada de simular a la factura, contiene los datos del cliente y carrito
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public class Receipt {
    String client;
    int nit;
    String date;
    int receiptNo;

    public Receipt(String c, int n, String d, int rn){
        this.client = c;
        this.nit = n;
        this.date = d;
        this.receiptNo = rn;
    }

    public String[] getReceipt(){
        
        String nitS = String.valueOf(this.nit);
        String rnS = String.valueOf(this.receiptNo);

        String[] receipt = {this.client, nitS, this.date, rnS};

        return receipt;
    }
}
