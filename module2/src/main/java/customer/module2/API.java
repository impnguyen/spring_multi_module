package customer.module2;

public class API {
    private MyPrinter2 printer2;

    public API(){
        this.printer2 = new MyPrinter2("");
    }

    public void getPrintMessage() {
        this.printer2.printMessage();
    }

    public void setMessage(String msg){
        this.printer2.setMessage(msg);
    }

    
}
