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
